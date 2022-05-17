import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class CreateTable {

	public static void main(String[] args) {
		
		   String url="jdbc:mysql://localhost:3306/JDBC";
	       String user ="root";
	       String password ="Jeru@2002";
	       try {
	           Connection connect = DriverManager.getConnection(url,user,password);
	           Statement stmt = connect.createStatement();
	           String sql="CREATE TABLE Student(id tinyint PRIMARY KEY AUTO_INCREMENT,NAME varchar(20),CLASS tinyint)";
	           stmt.executeUpdate(sql);
	           System.out.println("TABLE CREATED");
	       } catch (SQLException e) {
	          System.out.println("Not created ..");
	          e.printStackTrace();
	       }

	}

}
