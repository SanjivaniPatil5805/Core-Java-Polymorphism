package com.practice.polymorphism;

import java.util.Scanner;

public class MaxNumber {

	// Create a method max() to find maximum of: two numbers, three numbers

	public void max(int a, int b) {

		if (a > b) {

			System.out.println("Max Number = " + a);

		} else if (b > a) {

			System.out.println("Max Number = " + b);

		} else {

			System.out.println("Enter Different Numbers.");

		}

	}

	public void max(int a, int b, int c) {

		if (a > b && a > c) {

			System.out.println("Max Number = " + a);

		} else if (b > a && b > c) {

			System.out.println("Max Number = " + b);

		}  else if (c > a && c > b) {

			System.out.println("Max Number = " + c);

		} else {

			System.out.println("Enter Different Numbers.");

		}

	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		MaxNumber m = new MaxNumber();
		
		System.out.println("Enter two intger numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		m.max(num1, num2);
		
		System.out.println("Enter three intger numbers : ");
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		m.max(num3, num4, num5);
		
		sc.close();
		
		
	}

}
