

<html>
<body bgcolor="white">
<%@ page import = "java.sql.*" %>
<h1 align="center">WELCOME EMPLOYEE PROFILE
<br><br><br>
<a href="apply_leaves.html">Apply for Leaves</a>
<a href="leave_applied.jsp">View Leave Status</a>
<a href="index.html">Logout</a>
</h1>

<%@ page import = "java.sql.*" %>
<table border="2" width="400" height="200" align="center">
<tr><td>ID</td><td>Name</td><td>Salary</td><td>Address</td><td>Designation</td><td>Email</td><td>Mobile</td></tr>
<%
Connection connection= null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/mondee";
String user ="root";
String pass = "Meta@123";
connection = DriverManager.getConnection(url, user, pass);
int eid = (Integer)session.getAttribute("eid");


PreparedStatement ps = connection.prepareStatement("select * from employee where eid=?");
ps.setInt(1,eid);
ResultSet rs = ps.executeQuery();
while(rs.next()){
	%>
	<tr>
	<td><%= rs.getInt(1) %></td><td><%= rs.getString(2) %></td><td><%= rs.getInt(3) %></td><td><%= rs.getString(4) %></td>
	<td><%= rs.getString(5) %></td><td><%= rs.getString(6) %></td><td><%= rs.getLong(8) %></td>
	</tr>
	
<%} %>
</table>	
</body>
</html>