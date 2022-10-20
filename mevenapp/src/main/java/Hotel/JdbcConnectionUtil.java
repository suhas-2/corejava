package Hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Hospital.JDBCConnectionUtil;
import Hospital.JDBCUtil;

public class JdbcConnectionUtil {
	
	private JDBCConnectionUtil connectionUtil;
	private static Connection connection;
	private JdbcConnectionUtil() {
		
	}
	
	
	static {
		
		try {
			connection = DriverManager.getConnection(JDBCUtil.URL,JDBCUtil.USERNAME,JDBCUtil.PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
				}
	public static Connection getConnection() {
		return connection;
	}
	
	
	}


