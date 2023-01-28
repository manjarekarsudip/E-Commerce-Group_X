package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Scanner;

public class UserRegistration {
	public UserRegistration userDetail() {
		UserRegistration userRegistration =new UserRegistration();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter User Name:" );
		String name = sc.next();
		
		System.out.println("Enter Password:");
		String password=sc.next();
		
		HashMap<String,String> map=new HashMap<String,String>();
		Connection con=null;
		PreparedStatement ps=null;
		try {
			ConnectionProvider connection=new ConnectionProvider();
			con=connection.getConnectionDetails();
			ps = con.prepareStatement("Select * from user");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String uName=rs.getString("UserName");
				String pWord=rs.getString("Password");
				map.put(uName, pWord);	
			}
			if((!map.containsKey(name))&&(!map.containsValue(password))) {
				UserLogin userLogin =new UserLogin();
				userLogin.getUserAccess(name, password);
				
				DisplayMenu displayMenu = new DisplayMenu();
				displayMenu.getMenu();
				
				PurchaseProduct purchaseProduct = new PurchaseProduct();
				purchaseProduct.userPurchaseDetail(name);
				
				TotalPrice totalPrice = new TotalPrice();
				totalPrice.getPrice(name);
				
			}else if((map.containsKey(name))&&(!map.containsValue(password))) {
				System.out.println("Wrong Password");
			}else if ((map.containsKey(name))&&(map.containsValue(password))) {
				DisplayMenu displayMenu = new DisplayMenu();
				displayMenu.getMenu();
				
				PurchaseProduct purchaseProduct = new PurchaseProduct();
				purchaseProduct.userPurchaseDetail(name);
				
				TotalPrice totalPrice = new TotalPrice();
				totalPrice.getPrice(name);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userRegistration;	
	}
}
