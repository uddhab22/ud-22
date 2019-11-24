package com.class24;

public class Task1 {
	/*
	 * Write a program  that will have a 4 different 
	 * access levels of constructors and 
	 * create 3 objects of this class: 
	 * 1 - inside same class; 
	 * 2 - from outside the class and observe result. 
	 * 3 - from different class inside different package
	 */
	
	public Task1() {
		System.out.println("public");
	}
	protected Task1(int n) {
		System.out.println("protected");
	}
	 Task1(String Str) {
		System.out.println("default");
	}
	private Task1(int n1,int n2) {
		System.out.println("private");
	}

	public static void main(String[] args) {
		Task1 obj = new Task1();
		Task1 obj1 = new Task1(1);
		Task1 obj2 = new Task1("string");
		Task1 obj3 =new Task1(1, 1);
		
	}

}
