package mevenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Practice2 {

	public static void main(String[] args) throws Exception{
		
		String selectSql = "select san_id,san_name,san_dep,san_shift from follow.san_data";
		String url = "jdbc:mysql://localhost:3306";
		String user = "root";
		String pwd="Xworkzodc@123";
		
		//Connection con = null;
		
		try {
			
			//Class.forName("com.mysql.jdbc.Driver");
			
			 Connection con1 = DriverManager.getConnection(url, user, pwd);
		 
		 Statement st = con1.createStatement();
		 
		ResultSet rs =  st.executeQuery(selectSql);
		// st.execute("insert into" + " xworkz.employee values(101,'suhas')");
		
		while(rs.next()) {
			
			System.out.println(rs.getInt(1) + " -- "+rs.getString("san_name")+" -- "+rs.getString("san_dep")+" --"+rs.getInt("san_shift"));
			
		}
		 
		 con1.close();
		
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		

	

}
}
