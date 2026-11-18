package com.practice.polymorphism;

public class Demo {
	
	// Create a class Demo and overload show() using: (int, String) , (String, int)
	
	public void show(int a, String b) {
		
		System.out.println("Integer value = "+a);
		System.out.println("String value = "+b);
		
	}

	public void show(String a, int b) {
		
		System.out.println("String value = "+ a);
		System.out.println("Integer value = "+b);
		
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		d.show(6, "Java");
		d.show("Python", 4);
		
	}
	
}
