import java.sql.*;


public class InsertValues {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/JDBC";
		String user="root";
		String password="Jeru@2002";

		try {
		Connection connection=DriverManager.getConnection(url,user,password);

	    String insert1 = "INSERT INTO Students VALUES (2,'Jeru',7),(3,'Ruby',6),(4,'John',8)";
	    PreparedStatement statement=connection.prepareStatement(insert1);
	   
	    statement.executeUpdate(insert1);
	  
	    statement.close();
	    connection.close();
	    
	    System.out.println("inserted");
		
		}
		catch(SQLException e) {
			System.out.println("values have been not inserted");
			e.printStackTrace();
		}
		
	}

}
