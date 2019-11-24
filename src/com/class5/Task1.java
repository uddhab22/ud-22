package com.class5;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Write a program that will print whether it is a weekend or weekday. 
		 * If any day from 1-5 → output “It is a weekday”, 
		 * anyday from 6-7 → output “It is a weekend”, 
		 * any other day → output “Invalid day”
		 * 
		 */
				
		int n =8;
		
		
		if (n>=1 && n<=5) {
			System.out.println("It is a weekday");
		}
		else if (n==6 || n==7) {
			System.out.println("It is a weekend");
		}
		else {
			System.out.println("Invalid day");
		}
			
				
	}

}
