package com.velocity;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Welcome to Apple Store");
		System.out.println("SELECT ACCESS MODE");
		System.out.println("1. Admin Portal");
		System.out.println("2. User Mode");
		System.out.println("3. Exit");
		boolean choice=true;
		Scanner sc=new Scanner(System.in);
		while(choice) {
			System.out.println("Enter Your Choice");
			int a=sc.nextInt();
			switch(a) {
			case 1:System.out.println("Admin Portal");
			AdminMode adminMode=new AdminMode();
			adminMode.getAdminAccess();
			break;
			case 2:System.out.println("User Mode");
			UserMode userMode=new UserMode();
			userMode.getUserAccess();
			break;
			case 3:System.out.println("Thank You For visiting");
			choice=false;
			break;
			default:System.out.println("Invalid Input Please try again");
			choice=true;
			break;
				
			
			
			}
		}
		

	}

}
