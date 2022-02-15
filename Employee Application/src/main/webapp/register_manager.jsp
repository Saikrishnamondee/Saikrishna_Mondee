<html>
<body bgcolor="grey">
<%@ page import = "java.sql.*" %>
<%
Connection connection= null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/mondee";
String user ="root";
String pass = "Meta@123";
connection = DriverManager.getConnection(url, user, pass);

String id = request.getParameter("id");
int id2=Integer.parseInt(id);
String name =request.getParameter("name");
String email =request.getParameter("email");
String password =request.getParameter("password");
String phone =request.getParameter("phone");
long mobile = Long.parseLong(phone);
String department =request.getParameter("department");

String sql = "insert into manager(id,name,email,password,phone,department) values (?,?,?,?,?,?)";			
	PreparedStatement ps =connection.prepareStatement(sql);
	ps.setInt(1,id2);
	ps.setString(2, name);
	ps.setString(3, email);
	ps.setString(4, password);
	
	ps.setLong(5, mobile);
	ps.setString(6, department);
	int x =ps.executeUpdate();
	if (x!=0)
		
		response.sendRedirect("./login_manager.html");
%>
<h1 align="center">Registered Successfully </h1>

</body>
</html>