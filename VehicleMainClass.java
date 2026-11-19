package com.practice.polymorphism;

import java.util.Scanner;

public class VehicleMainClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Available vehicles for rent : ");
		System.out.println("1.Car");
		System.out.println("2.Bike");
		System.out.println("3.Scooter");
		System.out.println("4.Bus");
		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 : 
				
				Vehicle v1 = new Car();
				System.out.print("Enter number of days : ");
				int days1 = sc.nextInt();
				v1.calculateRent(days1);
				
				break;
				
			case 2 :
				
				Vehicle v2 = new Bike();
				System.out.print("Enter number of days : ");
				int days2 = sc.nextInt();
				v2.calculateRent(days2);
				
				break;
				
			case 3 : 
				
				Vehicle v3 = new Scooter();
				System.out.print("Enter number of days : ");
				int days3 = sc.nextInt();
				v3.calculateRent(days3);
				
				break;
				
			case 4 : 	
				
				Vehicle v4 = new Bus();
				System.out.print("Enter number of days : ");
				int days4 = sc.nextInt();
				v4.calculateRent(days4);
				
				break;
				
			default : 
				
				System.out.println("Invalid choice...Please enter valid choice");
			
			}
			
		sc.close();	
		
	}

}
