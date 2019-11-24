package com.class5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		/*if num is between 1-10 --> this num is samll
		 * if num is between 11-100--> this num is medium
		 * if num is between 101-1000--> this num is large 
		 * anyother number-- is out of range
		 */
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Please enter a number");
		int n=input.nextInt();
		
		
		if (n>=1 && n<=10) {
			System.out.println("This num is small");
		}
		else if (n>=11 && n<=100) {
			System.out.println("This num is medium");
		}
		else if (n>=101 && n<=1000) {
			System.out.println("This num is large");
		}
		else {
			System.out.println("this number is out of range");
		}

		
	}

}
