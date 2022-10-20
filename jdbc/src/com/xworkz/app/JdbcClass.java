package com.xworkz.app;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcClass {
	
	static final String  USERNAME = "root";
	static final String PASSWORD = "root";
	static final String URL="jdbc:mysql://localhost:3306";


	public static void main(String[] args) {
		System.out.println("main method started");
		createJdbc();
		System.out.println("main method ended");
	}
		
		public static void createJdbc() {
			
			//load mysql driver
			try {
			
			Class.forName("com.mysql.jdbc.driver"); // u need add mysql driver jar
			
			//step create connection
			Connection con= DriverManager.getConnection(URL,USERNAME,PASSWORD);
					
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

