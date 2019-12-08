package com.class25;

public class Task2 {
	
	/*
	 * Create 1 class with a static method that has 3 overloaded forms. 
	 * Then call each overloaded method with specific arguments 
	 * and observe result.
	 */
	
	static void result(int x) {
		System.out.println("with one int paramater");
	}
	static void result(int x, int y) {
		System.out.println("with 2 int parameters");
	}
	static void result(String str) {
		System.out.println("with 1 string parameter");
	}
	public static void main(String[] args) {
		result(1);
		System.out.println();
		result(1, 1);
		System.out.println();
		result("AAA");
	}

}
