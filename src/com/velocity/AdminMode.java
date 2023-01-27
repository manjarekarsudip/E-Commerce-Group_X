package com.velocity;

import java.util.Scanner;

public class AdminMode {
public AdminMode getAdminAccess() {
	AdminMode adminMode =new AdminMode();
	System.out.println("Welcome to Admin Portal");
	System.out.println("Select Access");
	System.out.println("1. Check product Quantity");
	System.out.println("2. Registered User List"); 
	System.out.println("3. Purchase History");
	System.out.println("4. Exit Admin Portal");
	boolean choice =true;
	Scanner sc=new Scanner(System.in);
	while(choice) {
		System.out.println("Enter Your Choice::");
		int a=sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("Check product Quantity");
			CheckQuantity checkQuantity =new CheckQuantity();
			System.out.println("Enter Product ID");
			int id=sc.nextInt();
			checkQuantity.getQuantity(id);
			break;
		case 2:
			System.out.println("Registerd User List");
			RegisterdList registerdList =new RegisterdList();
			registeredList.getregisteredList();
		break;
		case 3:
			System.out.println("Purchase History");
			UserPurchaseList userPurchaseList=new UserPurchaseList();
			userPurchaseList.getPurchaseList();
			break;
		case 4:
			System.out.println("Exit Successful");
			choice=false;
			break;
			default: 
				System.out.println("Invalid Input Try Again");
				choice=true;
				break;		
		
		}
	}
	return adminMode;
}
}
