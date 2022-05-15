import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class UpdateValues {

	public static void main(String[] args) {
 
		String url="jdbc:mysql://localhost:3306/JDBC";
		String username="root";
		String password="Jeru@2002";
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			String sql="UPDATE Students SET NAME='Sess' WHERE id=1";
			Statement stmt=connection.prepareStatement(sql);
			stmt.executeUpdate(sql);
			System.out.println("updated values");
		}
		catch(SQLException e) {
			System.out.println("not updated");
			e.printStackTrace();
		}
		}

}
