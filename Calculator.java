package com.practice.polymorphism;

public class Calculator {
	
	// Overload add()  to add two integers and three integers.

	public void add(int a, int b) {

		System.out.println(a + " + " + b + " = " + (a + b));

	}

	public void add(int a, int b, int c) {

		System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));

	}
	
	// Overload sum() with different data types.
	
	public void sum(int a, int b ) {
		
		System.out.println(a + " + " + b + " = " + (a + b));
		
	}
	
	public void sum(float a, float b) {
		
		System.out.println(a + " + " + b + " = " + (a + b));
		
	}
	
	public void multiply(int a, int b) {
		
		System.out.println(a + " * " + b + " = " +(a * b));
		
	}
	
	// Overload multiply() with two integer values and two double values.
	
	public void multiply(double a, double b) {
		
		System.out.println(a + " * " + b + " = " +(a * b));
		
	}
	
	

	public static void main(String[] args) {

		Calculator c = new Calculator();
		
		c.add(5, 8);
		c.add(7, 5, 9);
		
		c.sum(9, 5);
		c.sum(4.5f, 6.2f);
		
		c.multiply(6, 9);
		c.multiply(6.5, 4.3);

	}

}
