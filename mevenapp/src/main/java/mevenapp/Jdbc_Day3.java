package mevenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Day3 {

	public static void main(String[] args) { 
		
		//url to connect to mysql database
		//jdbc --> main protocol
		//://localhost -->system name
		//(if we are connecting remote system then in place of localhost we need to give
		//ip address of remote system.
		//port --> mysql port number
		
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String pwd = "Xworkzodc@123";
		
		
		
		try {
			//step1: load driver and register driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//step2: create connection
			//Connection is interface(present in java.sql)
			//getConnection overloaded method (its an factory method) which create connection type of object
			
			//which have 3 overloaded method
			//1.getConnection(String fullurl);
			//2.getConnection(String url, String userName, String password);
			//3.getConnection(String url, Property props)
			Connection con = DriverManager.getConnection(url, username, pwd);
			
			//step3: create statement
			//Statement is an interface(java.sql package)
			//it is used to create platform to communicate with a database using sql query
			Statement st = con.createStatement();
			
			//step4: exicute a connection
			//its just exicute sql query
			//exicutes only dml query
			st.execute("insert into" + " xworkz.employee values(101,'suhas')");
			
			//step5: close a connection in finally block
			con.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
