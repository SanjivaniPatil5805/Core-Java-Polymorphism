package com.practice.polymorphism;

public class Student {

	// Overload a constructor in a Student class to initialize: default values, only id, id and name
	
	private int id;
	private String name;
	
	public Student() {
		
		System.out.println("Default value of id = "+ id);
		System.out.println("Default value of name = "+ name);
		
	}
	
	public Student(int id) {
		
		this.id = id ;
		System.out.println("Student ID = "+id);
		
	}
	
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
		System.out.println("Student ID = "+id);
		System.out.println("Student Name = "+name);
		
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		System.out.println("-----------------------");
		
		Student s2 = new Student(4);
		
		System.out.println("-----------------------");
		
		Student s3 = new Student(6, "Ram");
		
	}
	
}
