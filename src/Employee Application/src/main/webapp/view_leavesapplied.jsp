<html>
<body bgcolor="green">
<br><br><br>
<h1 align="center">WELCOME 
<br><br><br>

<a href="index.html">Logout</a>
</h1>
<br><br><br>
<%@ page import = "java.sql.*" %>
<table border="2" width="400" height="200" align="center">
<tr>

<td>EID</td>
<td>Ename</td>

<td>From</td>
<td>To</td>

<td>Department</td>
<td>Status</td>
<td>Action</td>
</tr>
<%
Connection connection= null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/mondee";
String user ="root";
String pass = "Meta@123";
connection = DriverManager.getConnection(url, user, pass);
String department = (String)session.getAttribute("department");

PreparedStatement ps = connection.prepareStatement("select * from leaves where department=?");
ps.setString(1,department);
ResultSet rs = ps.executeQuery();
while(rs.next()){
	%>
	<tr>
	
	<td><%= rs.getInt("eid") %></td>
	<td><%= rs.getString("ename") %>
	
	<td><%= rs.getString("fromdate") %></td>
	<td><%= rs.getString("todate") %></td>
	
	<td><%= rs.getString("department") %></td>
	<td><%= rs.getString("status") %></td>
	<td> <a href="accept_leave.jsp?id=<%=rs.getInt(1)%>">Accept</a></td>
	</tr>
	
<%} %>
</table>	
</body>
</html>