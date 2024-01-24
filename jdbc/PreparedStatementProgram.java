package jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementProgram {
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	public PreparedStatementProgram() throws ClassNotFoundException, SQLException{
		connection =MyConnection.getMyConnection();
		System.out.println("Statement is established");
	}
	public void insertRecord(int id,String name,String email,int age,String city) throws SQLException
	{
		preparedStatement=connection.prepareStatement("insert into person values(?,?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, email);
		preparedStatement.setInt(4, age);
		preparedStatement.setString(5, city);
		int n=preparedStatement.executeUpdate();
		System.out.println(n+"record is inserted");
		
		
	}
	public void searchByCity(String city) throws SQLException
	{
		preparedStatement=connection.prepareStatement("select * from person where city=?");
		preparedStatement.setString(1, city);
		resultSet=preparedStatement.executeQuery();
		while(resultSet.next())
		{
			System.out.println(resultSet.getInt(1)+"\t");
			System.out.println(resultSet.getString(2)+"\t");
			System.out.println(resultSet.getString(3)+"\t");
			System.out.println(resultSet.getInt(4)+"\t");
			System.out.println(resultSet.getString(5)+"\t");
			System.out.println();
		}
	}
	public void updateRecord(String city,int id) throws SQLException
	{
		preparedStatement=connection.prepareStatement("update person set city=? where pid=?");
		preparedStatement.setString(1, city);
		preparedStatement.setInt(2 , id);
		
		int n=preparedStatement.executeUpdate();
		System.out.println(n+"record is updated");
		
	}
	public void deleteRecord(int id) throws SQLException
	{
		preparedStatement=connection.prepareStatement("delete from person where pid=?");
		preparedStatement.setInt(1, id);
		
		int n=preparedStatement.executeUpdate();
		System.out.println(n+"record is deleted");
	}

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		PreparedStatementProgram program=new PreparedStatementProgram();
		Scanner sc=new Scanner(System.in);
		int id,age;
		String name,email,city;
		
		System.out.println("Enter your Choice. \n 1. Insert new record \n 2. Update record \n 3. SearchBy record \n 4. Delete record");
		int choice=sc.nextInt();
		System.out.println("-------------------------------------------------------------------------------------------------------");
		switch(choice)
		{
		case 1: program.insertRecord(16, "Sanjai", "sanjai@gmail.com", 22, "Banglore");
		        break;
		case 2: program.updateRecord("Chennai",16);
		        break;
		case 3: System.out.println("Enter city");
		//sc.next();
		        city=sc.next();
		        System.out.println("Search by City" +city);
		        program.searchByCity(city);
		        break;
		case 4: System.out.println("Delete record");
		        break;
		default:System.out.println("Invalid");
		 }
		

	}

}
