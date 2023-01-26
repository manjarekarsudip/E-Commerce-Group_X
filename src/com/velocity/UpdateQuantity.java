package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateQuantity {

	public void getUpdateQuantity(int quantity, String productName) {
		
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			ConnectionProvider connection = new ConnectionProvider();
			con = connection.getConnectionDetails();
			ps = con.prepareStatement("UPDATE ADMIN SET Quantity=? WHERE Name=?");
			ps.setInt(1, quantity);
			ps.setString(2, productName);
			ps.executeUpdate();
			System.out.println("Quantity Updated...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
