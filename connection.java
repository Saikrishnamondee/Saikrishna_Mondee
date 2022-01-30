import java.sql.*;
public class connection {
	public static void main (String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mondee", "root", "Meta@123");
		if(con!=null) {
			System.out.println("Connection Sucessfull");
		}
			else
			{
				System.out.println("Connection not Sucessfull");
				
				
			}
		
		
		String sqlquery = "select * from personsdata";
		Statement st = con.createStatement();
		st.execute(sqlquery);
		System.out.println("selected sucessfully");
		con.close();
				
		}
		}


