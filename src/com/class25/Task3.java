package com.class25;

public class Task3 {
	/*
	 * Create 1 class with a private method that has 3 overloaded forms.
	 *  Then call each overloaded method with specific 
	 *  arguments and observe result.
	 */
	
	private void observe(int x) {
		System.out.println(" Private with 1 int parameter");
	}
	private void observe(int x, String str) {
		System.out.println(" Private with 1 int parameter and 1 string");
	}
	private void observe(String str) {
		System.out.println(" Private with 1 string parameter");
	}
	
	public static void main(String[] args) {
		Task3 TS = new Task3();
		TS.observe(1);
		System.out.println();
		TS.observe("String");
		System.out.println();
		TS.observe(50, "str");
	}

}
