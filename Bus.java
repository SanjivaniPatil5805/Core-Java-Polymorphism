package com.practice.polymorphism;

public class Bus extends Vehicle {
	
	@Override
	public void calculateRent(int days) {
		
		System.out.println("Bus rent per day = 5000");
		System.out.println("Total Rent = "+(5000 * days));
		
	}

}
