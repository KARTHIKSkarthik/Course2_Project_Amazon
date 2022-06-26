import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Amazon_Project {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//Code to retrieve table
		
		 String  dbUrl = "jdbc:mysql://localhost:3306/Amazon";
	       String username = "root";
	        String password = "root";
	        String query1 = "Select * from products";
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con1 = DriverManager.getConnection(dbUrl, username, password);
        Statement stmt1 = con1.createStatement();
        ResultSet rs = stmt1.executeQuery(query1);
        while(rs.next()){
            System.out.println("Brand: " + rs.getString("Brand")  + "\t");
            System.out.println("Model Name: " + rs.getString("Model_Name")  + "\t");
            System.out.println("Price: " + rs.getString("Price")  + "\t");
           System.out.println();
	}
	}

}
