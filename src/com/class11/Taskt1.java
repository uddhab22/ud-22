package com.class11;

public class Taskt1 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. 
		// Using 2 different loops print all values from the array.
		
		
		String[] cars = {"Ford","GMC","Honda","BMW","Toyota","Audi"};
		
		for (int i=0; i<6; i++) {
			System.out.println(cars[i]);
		}
		
		
		
		System.out.println("*******************************");
		
		
		for(String x: cars ) {
			
			System.out.println(x);
			
		}
		
		
		
		
	}

}
