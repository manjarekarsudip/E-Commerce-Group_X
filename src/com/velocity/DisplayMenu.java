package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DisplayMenu {

	public DisplayMenu getMenu(){
		DisplayMenu displayMenu = new DisplayMenu();
		Connection con = null;
		PreparedStatement ps = null;
		try {
		ConnectionProvider connection = new ConnectionProvider();
		con = connection.getConnectionDetails();
		ps = con.prepareStatement("SELECT * FROM products");
		ResultSet rs = ps.executeQuery();
		String productId = "product_id";
		String name = "name";
		String description = "description";
		String price = "price";
		//String quantity = "quantity";
		System.out.printf("%-30s%-30s%-30s%-30s\n",productId,name,description,
				price);
		while (rs.next()) {
			int id = rs.getInt("product_id");
			String pName = rs.getString("name");
			String descr = rs.getString("description");
		    int pr = rs.getInt("price");
		    //int quan = rs.getInt("quantity");
		    System.out.printf("%-30s%-30s%-30s%-30s\n",id,pName,descr,pr);
		    
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return displayMenu;	
	}
	
}
