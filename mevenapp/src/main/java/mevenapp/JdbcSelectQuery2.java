package mevenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectQuery2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String selectSQL = "SELECT id,name,address,rollno from xworkz.student";
		String url = "jdbc:mysql://localhost:3306";
		String username= "root";
		String pwd = "Xworkzodc@123";
		
Connection con = null;
		
		try {
			con = DriverManager.getConnection(url,username,pwd);
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(selectSQL);
			while(rs.next()) {
				System.out.println("Student id:   " +rs.getInt(1));
				System.out.println("Student name:    "+rs.getString("name"));
				System.out.println("Student rollno:    "+rs.getString("rollno"));
				System.out.println("Student address:    "+rs.getString("address"));
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	

	}
}
