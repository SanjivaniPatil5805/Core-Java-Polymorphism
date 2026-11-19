package com.practice.polymorphism;

public class CreditCardPayment extends Payment {
	
	@Override
	public void makePayment() {
		
		System.out.println("Payment done through credit card.");
		
	}

}
