package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckQuantity {
 public int getQuantity(int id) {
	 CheckQuantity checkQuantity =new CheckQuantity();
	 int output=id;
	 Connection con=null;
	 PreparedStatement ps=null;
	 try {
		ConnectionProvider connection=new ConnectionProvider();
		con=connection.getConnectionDetails();
		ps=con.prepareStatement("SELECT * FROM products WHERE product_id=?");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		String productId = "product_id";
		String description = "description";
		String price = "price";
		String name = "name";
		String quantity = "quantity";
		System.out.printf("%-30s%-30s%-30s%-30s%-30s\n",productId,description,price,name,quantity);
		
		while (rs.next()) {
			int proId = rs.getInt("product_id");
			String descr = rs.getString("description");
		    int pr = rs.getInt("price");
		    String pName = rs.getString("name");
		    int quan = rs.getInt("quantity");
		    System.out.printf("%-30s%-30s%-30s%-30s%-30s\n",proId,descr,pr,pName,quan);
		}	 
	} catch (Exception e) {
		e.printStackTrace();
	}
	 return output;
 }
}
