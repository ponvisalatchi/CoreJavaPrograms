package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
static Connection con;
	
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		
		if(con==null) {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ponvisalatchi", "root", "PonVisalatchi02092000");
			
			return con;
		}
		else {
			return con;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
