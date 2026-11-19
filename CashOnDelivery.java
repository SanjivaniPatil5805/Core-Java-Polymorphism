package com.practice.polymorphism;

public class CashOnDelivery extends Payment{
	
	@Override
	public void makePayment() {
		
		System.out.println("Cash will be collected on delivery.");
		
	}

}
