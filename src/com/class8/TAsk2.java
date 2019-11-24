package com.class8;

public class TAsk2 {

	public static void main(String[] args) {
		/*
		 * find sum of even & odd 
		 * from 1 to 20
		 * expecting 2 output
		 * sum of odd
		 * sum of even
		 */
		
		
		
		int sumOdd=0;
		int sumEven=0;
		
		for (int i=1; i<21; i+=2) {
			sumOdd=sumOdd+i;
		}
		
		for (int i=0; i<21; i+=2) {
			sumEven=sumEven+i;
		}
		
		System.out.println("The sum of odd number 1 to 20 is "+sumOdd);
		System.out.println();
		System.out.println("The sum of even number 1 to 20 is "+sumEven);
		
	}

}
