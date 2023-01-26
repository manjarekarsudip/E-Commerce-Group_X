package com.velocity;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	Connection con = null;
	public Connection getConnectionDetails() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
