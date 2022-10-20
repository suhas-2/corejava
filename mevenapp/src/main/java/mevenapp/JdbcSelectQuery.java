package mevenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String selectSQL = "SELECT * FROM xworkz.employee";
		String url = "jdbc:mysql://localhost:3306";
		String username= "root";
		String pwd = "Xworkzodc@123";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url,username,pwd);
			
			Statement st = con.createStatement();
			
			st.execute(selectSQL);
			
			ResultSet rs = st.executeQuery(selectSQL);
			while(rs.next()){
				System.out.println("ID: "  +rs.getInt(1));
				System.out.println("----Name: " +rs.getString("name"));
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
