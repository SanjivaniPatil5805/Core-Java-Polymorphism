package com.practice.polymorphism;

public class PaymentMainClass {
	
	public static void main(String[] args) {
		
		Payment payment = new UPIPayment();
		payment.makePayment();
		payment = new CreditCardPayment();
		payment.makePayment();
		payment = new CashOnDelivery();
		payment.makePayment();
		
	}

}
