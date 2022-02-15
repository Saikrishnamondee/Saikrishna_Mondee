<html>
<body bgcolor="wheat">
<%@ page import = "java.sql.*" %>

<%@ page import = "java.text.ParseException" %>
<%@ page import = "java.text.SimpleDateFormat"%>
<%@page import = "java.time.LocalDate"%>
<%@page import = "java.time.temporal.ChronoUnit"%>
<%@page import = "java.util.Date"%>
<%@page import = "java.util.concurrent.TimeUnit"%>
<%
Connection connection= null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/mondee";
String user ="root";
String pass = "Meta@123";
connection = DriverManager.getConnection(url, user, pass);

String ename =request.getParameter("ename");

String fromdate = request.getParameter("fromdate");

String todate = request.getParameter("todate");



String department=request.getParameter("department");


SimpleDateFormat myformat= new SimpleDateFormat("yyyy-MM-dd");



Date d1 = myformat.parse(fromdate);
Date d2 = myformat.parse(todate);

long diff = d2.getTime()-d1.getTime();

long NoofDays =TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);


//System.out.println(NoofDays+1 );


String sql = "insert into leaves(eid,ename,name,fromdate,todate,department,status) values (?,?,?,?,?,?,?)";
int eid=(Integer)session.getAttribute("eid");
PreparedStatement ps = connection.prepareStatement(sql);
ps.setInt(1,eid);
ps.setString(2,ename);
ps.setString(3, "None");
ps.setString(4,fromdate);
ps.setString(5,todate);

ps.setString(6,department);
ps.setString(7,"pending");

if ((NoofDays+1)<=3){
int x = ps.executeUpdate();
if (x!=0)
	response.sendRedirect("leave_applied.jsp");
}else {
	out.print(" More than 3 days not allowed");
}

%>
</body>
</html>