package com.practice.polymorphism;

public class Car extends Vehicle {
	
	@Override
	public void calculateRent(int days) {
		
		System.out.println("Car rent per day = 2000");
		System.out.println("Total Rent = "+(2000 * days));
		
	}

}
