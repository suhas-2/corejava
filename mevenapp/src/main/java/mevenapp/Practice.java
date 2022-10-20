package mevenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Practice {

	public static void main(String[] args)  {
		
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password = "Xworkzodc@123";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			//step2: create a connection 
			//Connection is a Interface in java.sql
			
			
				Connection con = DriverManager.getConnection(url,username,password);
				//statement is a interface in java
				//it is used 
				Statement st = con.createStatement();
				//its just exicute a query only dml queries
				//insert
				//st.execute("insert into" + " follow.san_data values(4239,'Prashanth','pd',7)");
				
				//delete
				//st.execute("delete from follow.san_data where san_shift = 4");
				
				//update
				st.execute("update follow.san_data set san_name='Dananjay' where san_id= 143");
				
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}

}
