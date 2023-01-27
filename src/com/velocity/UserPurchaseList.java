package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserPurchaseList {
	
	public void getPurchaseList() {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			ConnectionProvider connection = new ConnectionProvider();
			con = connection.getConnectionDetails();
			ps = con.prepareStatement("SELECT * FROM history");
			ResultSet rs = ps.executeQuery();
			String  name = "username";
			String pName = "productname";
			String pr = "price";
			String quan = "quantity";
			System.out.printf("%-30s%-30s%-30s%-30s\n",name,pName,pr,quan);
			while(rs.next()) {
				
				String uName = rs.getString("username");
				String prodName =rs.getString("productname");
				int price = rs.getInt("Price");
				int quantity = rs.getInt("quantity");
				System.out.printf("%-30s%-30s%-30s%-30s\n",uName,prodName,price,quantity);
				
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
