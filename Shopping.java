package com.practice.polymorphism;

public class Shopping {

	public void purchase(int productId) {

		System.out.println("Product ID = " + productId);
		System.out.println("Product pruchase successfull..!");

	}

	public void purchase(int productId, int quantity) {

		System.out.println("Product ID = " + productId);
		System.out.println("Product Quantity = " + quantity);
		System.out.println("Product pruchase successfull..!");

	}

	public void purchase(int productId, float discount) {

		System.out.println("Product ID = " + productId);
		System.out.println("Product Discount = " + discount + "%");
		System.out.println("Product pruchase successfull..!");

	}
	
	public void purchase(String productName, int quantity) {

		System.out.println("Product Name = " + productName);
		System.out.println("Product Quantity = " + quantity);
		System.out.println("Product pruchase successfull..!");

	}

	public static void main(String[] args) {
		
		Shopping s = new Shopping();
		
		s.purchase(454);
		System.out.println("---------------------------------");
		s.purchase(534, 43);
		System.out.println("---------------------------------");
		s.purchase(735, 10f);
		System.out.println("---------------------------------");
		s.purchase("Laptop", 23);
		
	}
	
}
