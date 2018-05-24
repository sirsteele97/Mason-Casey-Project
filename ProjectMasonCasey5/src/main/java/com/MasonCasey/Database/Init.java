package com.MasonCasey.Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Init {
	
	public static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url ="jdbc:mysql://localhost:3306/studentAccounts";
			String username = "root";
			String password = "6exAppea1";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			return conn;
		} catch(Exception e) {System.out.println(e);}
		
		
		return null;
		
	}
}

