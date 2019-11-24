package com.class19;

public class recap {
	void sum (int n1, int n2) {
		int c = n1+n2;
		System.out.println("The sum of 2 number is "+c);
	}
	//create a method to display hello 5 times
	void hello(int times) {
		for (int i=0; i<times; i++) {
			System.out.println("Hello");
		}
	}
	
	void saysomething(String word, int times) {
		for (int i=0; i<times; i++) {
			System.out.print(word+" ");
		}
		
	}
	public static void main(String[] args) {
		recap obj = new recap();
		obj.sum(10, 10);
		System.out.println();
		System.out.println("========================");
		obj.hello(5);
		System.out.println("=========================");
		obj.saysomething("Hi", 5);
		System.out.println("==========================");
	}
	
}
