package com.practice.polymorphism;

public class UPIPayment extends Payment{
	
	@Override
	public void makePayment() {
		
		System.out.println("Payment done through UPI.");
		
	}

}
