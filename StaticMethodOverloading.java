package com.practice.polymorphism;

public class StaticMethodOverloading {
	
	// Overload a static method print() with: one parameter, two parameters
	
	public static void print(String a) {
		
		System.out.println(a);
		
	}
	
	public static void print(String a, String b) {
		
		System.out.println(a + " " + b);
		
	}
	
	public static void main(String[] args) {
		
		StaticMethodOverloading s = new StaticMethodOverloading();
		
		s.print("Welcome...!");
		s.print("Java", "Learner.");
		
	}

}
