package com.practice.polymorphism;

import java.util.Scanner;

public class DisplayValue {

	public int display(int a) {

		return a;

	}

	public String display(String a) {

		return a;

	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DisplayValue d = new DisplayValue();
		
		System.out.print("Enter an integral value : ");
		int a = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter an string value : ");
		String s = sc.nextLine();
		
		System.out.println("Integral Value = "+d.display(a));
		System.out.println("String Value = "+d.display(s));
		
		sc.close();
		
	}

}
