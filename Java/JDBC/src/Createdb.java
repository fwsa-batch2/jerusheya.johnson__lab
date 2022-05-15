import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Createdb {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306";
	       String user ="root";
	       String password ="Jeru@2002";
	       try {
	           Connection connect = DriverManager.getConnection(url,user,password);
	           Statement stmt = connect.createStatement();
	           String sql="CREATE DATABASE JDBC";
	           stmt.executeUpdate(sql);
	           System.out.println("DB CREATED");
	       } catch (SQLException e) {
	          System.out.println("Not created ..");
	          e.printStackTrace();
	       }

	}

}
