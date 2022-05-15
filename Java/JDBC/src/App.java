import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args)  {
       String url="jdbc:mysql://localhost:3306";
       String user ="Local instance 3306";
       String password ="password";
       try {
           Connection connect = DriverManager.getConnection(url,user,password);
           String sql="CREATE DATABASE JDBC";
           Statement stmt = connect.createStatement();
           stmt.executeUpdate(sql);
           System.out.println("DB CREATED");
       } catch (SQLException e) {
          System.out.println("Not created ..");
          e.printStackTrace();
       }
    }
}
