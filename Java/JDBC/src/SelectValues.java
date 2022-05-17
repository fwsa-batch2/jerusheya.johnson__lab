import java.sql.*;
import java.sql.DriverManager;


public class SelectValues {
    public static void main(String[] args) {

        /*executeUpdate(): This method is used for execution of DML statement(INSERT, UPDATE and DELETE) which is return int value, count of the affected rows.
          executeQuery() : This method is used to retrieve data from database using SELECT query.*/
    
	String url="jdbc:mysql://localhost:3306/JDBC";
	String user="root";
	String password="Jeru@2002";

	try {
	Connection connection=DriverManager.getConnection(url,user,password);

    String insert1 = "SELECT * FROM Students";
    PreparedStatement statement=connection.prepareStatement(insert1);
   
    ResultSet result=statement.executeQuery(insert1);
  
    while (result.next()) {
      
        System.out.printf("%-10s",result.getInt(1));
        System.out.printf("%-10s",result.getString(2));
        System.out.printf("%-10s",result.getInt(3));
        System.out.println();
    }

    result.moveToInsertRow();
    result.updateInt(1,5);
    result.updateString(2,"jeyam");
    result.updateInt(3,5);
    result.insertRow();

    result.beforeFirst();
    
    while (result.next()) {
      
        System.out.printf("%-10s",result.getInt(1));
        System.out.printf("%-10s",result.getString(2));
        System.out.printf("%-10s",result.getInt(3));
        System.out.println();
    }


    statement.close();
    connection.close();
	
	}
	catch(SQLException e) {
		System.out.println("values have been not inserted");
		e.printStackTrace();
	}
    }
}

