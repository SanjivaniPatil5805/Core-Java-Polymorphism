package com.practice.polymorphism;

import java.util.Scanner;

public class CalculateSquareAndCube {
	
	// Overload a method calculate() to find: square of a number, cube of a number
	
	public void calculate(int a) {
		
		System.out.println("Square of "+a+" = "+(a * a));
		
	}
	
	public void calculate(long a) {
		
		System.out.println("Cube of "+a+" = "+(a * a * a));
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CalculateSquareAndCube c = new CalculateSquareAndCube();
		
		System.out.print("Enter a number to find square : ");
		int a = sc.nextInt();
		c.calculate(a);
		
		System.out.print("Enter a number to find cube : ");
		long b = sc.nextLong();
		c.calculate(b);
		
		sc.close();	
		
	}

}
