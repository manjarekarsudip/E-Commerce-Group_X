package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisteredList {

	public void registeredList(){
		Connection con=null;
		PreparedStatement ps=null;
		try {
			ConnectionProvider connection=new ConnectionProvider();
			con=connection.getConnectionDetails();
			ps=con.prepareStatement("SELECT * FROM user ");
			ResultSet rs=ps.executeQuery();
			String uName="UserName";
			String pWord="Password";
			System.out.printf("%-30s%-30s\n", uName,pWord);
			while(rs.next()) {
				String name=rs.getString("UserName");
				String password=rs.getString("Password");
				System.out.printf("%-30s%-30s\n",name,password);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
