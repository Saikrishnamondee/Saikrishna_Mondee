<html>
<body bgcolor="green">
<br><br><br>

<h1 bgcolor="black" align="center">WelCome to Leave Page
<a href="index.html">Logout</a>
</h1>
<br><br><br>
<%@ page import = "java.sql.*" %>
<table border="2" width="400" height="200" align="center">
<tr>
<td>ID</td>
<td>Employee ID</td>
<td>Employee Name</td>
<td>Manager Name</td>
<td>From</td>
<td>To</td>

<td>Department</td>
<td>Status</td>
</tr>
<%
Connection connection= null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/mondee";
String user ="root";
String pass = "Meta@123";
connection = DriverManager.getConnection(url, user, pass);
PreparedStatement ps = connection.prepareStatement("select * from leaves ");

ResultSet rs = ps.executeQuery();
while(rs.next()){
	%>
	<tr>
	<td><%= rs.getInt(1) %></td>
	<td><%= rs.getInt(2) %></td>
	<td><%= rs.getString(3) %></td>
	<td><%= rs.getString(4) %></td>
	<td><%= rs.getString(5) %> </td>
	<td><%= rs.getString(6) %></td>
	
	<td><%= rs.getString(7) %></td>
	<td><%= rs.getString(8)%></td>
	</tr>
	
<%} %>
</table>	
</body>
</html>