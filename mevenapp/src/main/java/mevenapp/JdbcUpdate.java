package mevenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306";
		String username= "root";
		String pwd = "Xworkzodc@123";
		
		Connection con = null;
		
		try {
			//Its not required
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,username,pwd);
			
			Statement st = con.createStatement();
			
			//update
			//st.execute("update xworkz.employee set name = 'Kala' where id= 101");
			
			//delete
			st.execute("delete from xworkz.employee where name = 'Ganesh'");
			
			System.out.println("=========Succesfully deleted=============");
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

 //all below operation done by database engine
 //query is diveded into chunks
   //it check for syntax error
   //exicute

    //by using statement interface we can pass only static sql query, Hacker can hack data from static sql query(sql injection can happen to avoid that we use prepared statement interface)
    //prepared statement uses dynamic sql query such as (?,?,?);
    //prpared statemnet is a sub interface of statemnt interface
     //prepared statement uses dynamic sql query to communicate database 
     // connection.prepareStatement(string query);
     //pst.setxxx(); to set value for dynamic sql query

    //example:
     //step3:
      //PreparedStatement pst = connection.prepareStatement
     //("insert into
      //first paramenter is index of column
    // second parameter value
     //pst.setInt(1,109);
     //pst.setString(2,"Rani kumari");
     //pst.execute
