package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductTable {
	
	Connection con = null;
	PreparedStatement ps= null;
	public void insertProducts(String name, String description, int price, int quantity) {
		try {
			ConnectionProvider connection= new ConnectionProvider();
			con = connection.getConnectionDetails();
			ps = con.prepareStatement("insert into products(name,description,price,quantity) values(?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, description);
			ps.setInt(3, price);
			ps.setInt(4, quantity);
			int i = ps.executeUpdate();
			System.out.println("Done..."+i);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con!=null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(ps!=null) {
				try {
					ps.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<=10; i++) {
		
		System.out.println("Enter Product name : ");
		String name = sc.nextLine();
		System.out.println("Enter Product Description : ");
		String description = sc.nextLine();
		System.out.println("Enter Price : ");
		int price = sc.nextInt();
		System.out.println("Enter Quantity : ");
		int quantity = sc.nextInt();
		ProductTable input = new ProductTable();
		input.insertProducts(name, description, price, quantity);
		}
		sc.close();
	}
}
