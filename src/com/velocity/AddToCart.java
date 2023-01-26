package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddToCart {

	public void insertProduct(String uName, String productName, int quantity) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			ConnectionProvider connection = new ConnectionProvider();
			con = connection.getConnectionDetails();
			ps = con.prepareStatement("SELECT price from Admin WHERE name=?");
			ps.setString(1, productName);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				ps= con.prepareStatement("INSERT into history (UserName,ProductName,Price,Quantity)"
						+ "VALUES (?,?,?,?)");
				int a = rs.getInt("Price");
				ps.setString(1, uName);
				ps.setString(2, productName);
				ps.setInt(3, a);
				ps.setInt(4, quantity);
				ps.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
