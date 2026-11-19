package com.practice.polymorphism;

public class Bike extends Vehicle {
	
	@Override
	public void calculateRent(int days) {
		
		System.out.println("Bike rent per day = 800");
		System.out.println("Total Rent = "+(800 * days));
		
	}

}
