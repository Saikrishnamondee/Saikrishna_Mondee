<html>
<body bgcolor="yellow">
<%@ page import = "java.sql.*" %>
<%
Connection connection= null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/mondee";
String user ="root";
String pass = "Meta@123";
connection = DriverManager.getConnection(url, user, pass);

String eid = request.getParameter("eid");
int eid2=Integer.parseInt(eid);
String ename =request.getParameter("ename");
String esalary =request.getParameter("esalary");
long   esalary2 = Long.parseLong(esalary);
String eadress =request.getParameter("eadress");
String designation =request.getParameter("designation");
String eemail =request.getParameter("eemail");
String password = request.getParameter("password");
String mobile = request.getParameter("mobile");
long mobile2 = Long.parseLong(mobile);

String sql = "insert into employee(eid,ename,esalary,eadress,designation,eemail,password,mobile) values (?,?,?,?,?,?,?,?)";			
	PreparedStatement ps =connection.prepareStatement(sql);
	ps.setInt(1,eid2);
	ps.setString(2, ename);
	ps.setLong(3, esalary2);
	ps.setString(4, eadress);
	ps.setString(5, designation);
	ps.setString(6, eemail);
	ps.setString(7, password);
	ps.setLong(8, mobile2);
	
	int x =ps.executeUpdate();
	if (x!=0)
		
		response.sendRedirect("./employee_login.html");
%>
<h1 align="center">Registered Successfully </h1>

</body>
</html>