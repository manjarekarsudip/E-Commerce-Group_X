package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserLogin {
	public UserLogin getUserAccess(String UserName, String Password) {
    	UserLogin userLogin = new UserLogin();
    	
    	Connection con = null;
    	PreparedStatement ps= null;
    	try {
    		ConnectionProvider connection = new ConnectionProvider();
    		con = connection.getConnectionDetails();
    		ps =con.prepareStatement("insert into user(UserName, Password) values(?,?)");
    		ps.setString(1, UserName);
    		ps.setString(2, Password);
    		ps.executeUpdate();
    		System.out.println("Successfully Logged In...");
    	} catch (Exception e) {
    		e.printStackTrace();
    	} 
    	return userLogin;
    }
	


}
