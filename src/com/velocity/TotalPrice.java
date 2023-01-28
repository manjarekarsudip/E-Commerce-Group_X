package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

	public class TotalPrice {
	    public void getPrice(String uName) {
	    	Connection con=null;
	    	PreparedStatement ps=null;
		try {
			ConnectionProvider connection=new ConnectionProvider();
			con=connection.getConnectionDetails();
			ps=con.prepareStatement("SELECT Price,Quantity from history where UserName=?");
			ps.setString(1, uName);
			ResultSet rs=ps.executeQuery();
			int totalprice =0;
			while(rs.next()) {
				int pr=rs.getInt("Price");
				int quant=rs.getInt("Quantity");
				totalprice=(pr*quant+totalprice);
			}
			System.out.println("Total Amount: "+totalprice);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
