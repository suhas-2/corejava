package mevenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AutoLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306";
		String username= "root";
		String pwd = "Xworkzodc@123";
		
		
		try {
			Connection con = DriverManager.getConnection(url,username,pwd);
			
			System.out.println("=========DB======== " +con.getMetaData().getDatabaseProductName());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
