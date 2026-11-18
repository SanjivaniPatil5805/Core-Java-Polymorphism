package com.practice.polymorphism;

import java.util.Scanner;

public class CalculateArea {
	
	public void area(double r) {
		
		double area = 3.142 * r * r;
		System.out.println("Area of Circle = "+area);
		
	}
	
	public void area(double length, double breadth) {
		
		double area = length * breadth;
		System.out.println("Area of Rectangle = "+area);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CalculateArea c = new CalculateArea();
		
		System.out.print("Enter radius for circle : ");
		double r = sc.nextDouble();
		c.area(r);
		
		System.out.print("Enter length for rectangle : ");
		double length = sc.nextDouble();
		
		System.out.print("Enter breadth for rectangle : ");
		double breadth = sc.nextDouble();
		
		c.area(length, breadth);
		
		sc.close();
		
	}

}
