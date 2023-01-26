package com.velocity;

import java.util.Scanner;

public class PurchaseProduct {

	public void userPurchaseDetail(String name) {
		System.out.println("1. iPhone 13");
		System.out.println("2. iPhone 14 Pro");
		System.out.println("3. AirPods 2nd Gen");
		System.out.println("4. AirPods 3rd Gen");
		System.out.println("5. AirPods Pro");
		System.out.println("6. iMac 24");
		System.out.println("7. MacBook M1");
		System.out.println("8. MacBook M2");
		System.out.println("9. MacBook Pro 14");
		System.out.println("10. MacBook Pro 16");
		System.out.println("0. Exit");
		
		boolean choice = true;
		Scanner sc = new Scanner(System.in);
		while(choice) {
			System.out.println("Enter Your Choice : ");
			int a = sc.nextInt();
			System.out.println("Enter Quantity : ");
			int quantity = sc.nextInt();
			
			AddToCart addToCart =new AddToCart();
			UpdateQuantity updateQuantity = new UpdateQuantity();
			
			switch(a) {
			case 1:
				String s1 = "iPhone 13";
				addToCart.insertProduct(name, s1, quantity);
				updateQuantity.getUpdateQuantity(quantity, s1);
				break;
			case 2:
				String s2 = "iPhone 14 Pro";
				addToCart.insertProduct(name, s2, quantity);
				updateQuantity.getUpdateQuantity(quantity, s2);
				break;
			case 3:
				String s3 = "AirPods 2nd Gen";
				addToCart.insertProduct(name, s3, quantity);
				updateQuantity.getUpdateQuantity(quantity, s3);
				break;
			case 4:
				String s4 = "AirPods 3rd Gen";
				addToCart.insertProduct(name, s4, quantity);
				updateQuantity.getUpdateQuantity(quantity, s4);
				break;
			case 5:
				String s5 = "AirPods Pro";
				addToCart.insertProduct(name, s5, quantity);
				updateQuantity.getUpdateQuantity(quantity, s5);
				break;
			case 6:
				String s6 = "iMac 24";
				addToCart.insertProduct(name, s6, quantity);
				updateQuantity.getUpdateQuantity(quantity, s6);
				break;
			case 7:
				String s7 = "MacBook M1";
				addToCart.insertProduct(name, s7, quantity);
				updateQuantity.getUpdateQuantity(quantity, s7);
				break;
			case 8:
				String s8 = "MacBook M2";
				addToCart.insertProduct(name, s8, quantity);
				updateQuantity.getUpdateQuantity(quantity, s8);
				break;
			case 9:
				String s9 = "MacBook Pro 14";
				addToCart.insertProduct(name, s9, quantity);
				updateQuantity.getUpdateQuantity(quantity, s9);
				break;
			case 10:
				String s10 = "MacBook Pro 16";
				addToCart.insertProduct(name, s10, quantity);
				updateQuantity.getUpdateQuantity(quantity, s10);
				break;
			case 0:
				System.out.println("ThankYou For Visiting...");
				choice=false;
				break;
			default:
				System.out.println("Invalid Input...");
			}
		}
	}
}
