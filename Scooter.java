package com.practice.polymorphism;

public class Scooter extends Vehicle {
	
	@Override
	public void calculateRent(int days) {
		
		System.out.println("Scooter rent per day = 500");
		System.out.println("Total Rent = "+(500 * days));
		
	}

}
