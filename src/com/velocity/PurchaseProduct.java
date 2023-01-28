package com.velocity;

import java.util.Scanner;

public class PurchaseProduct {

	public void userPurchaseDetail(String name) {

		System.out.println("11.                           Sort By Price");
		System.out.println("12.                           Exit");
		boolean choice = true;
		Scanner sc = new Scanner(System.in);
		while(choice) {
			System.out.println("Enter Your Choice : ");
			int a = sc.nextInt();
			System.out.println("Enter Quantity : ");
			int quantity = sc.nextInt();
			
			AddToCart addToCart =new AddToCart();
			UpdateQuantity updateQuantity = new UpdateQuantity();
			SortByPrice sortedPrice = new SortByPrice();
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
				String s7 = "MacBook Air M1";
				addToCart.insertProduct(name, s7, quantity);
				updateQuantity.getUpdateQuantity(quantity, s7);
				break;
			case 8:
				String s8 = "MacBook Air M2";
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
			case 11:
				sortedPrice.getSortedPrice();
				break;
			case 12:
				System.out.println("Thank You For Visiting...");
				choice=false;
				break;
			default:
				System.out.println("Invalid Input...");
				choice= true;
				break;
			}
		}
	}
}
