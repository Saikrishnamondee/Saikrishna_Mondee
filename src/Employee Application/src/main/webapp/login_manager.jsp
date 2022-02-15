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
String name =request.getParameter("username");
String password =request.getParameter("password");

String sql = "select * from manager where name=? and password=?";			
	PreparedStatement ps =connection.prepareStatement(sql);
	ps.setString(1, name);
	ps.setString(2, password);
	
	ResultSet rs = ps.executeQuery();
	if (rs.next())
		session.setAttribute("id", rs.getInt(1));
	session.setAttribute("department", rs.getString(6));
		response.sendRedirect("./home_manager.html");


%>
<h1 align="center">Login Successfully </h1>

</body>
</html>