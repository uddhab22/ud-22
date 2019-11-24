package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		/*
		 * ask user to enter age
		 * if age 1 -3 ---> you are a baby
		 * if 3-5 --> you are a toddler
		 * 5-12 --> kid
		 * 12-19 --> teenager
		 * 20 or more --> adult
		 * 
		 */
		
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter your age");
		int age = input.nextInt();
		
		if (age>0 && age<=3) {
			System.out.println("you are a baby");
		}
		else if (age>3 && age<=5) {
			System.out.println("you are a toddler");
		}
		else if (age>5 && age<=12) {
			System.out.println("you are a kid");
		}
		else if (age>12 && age<=19) {
			System.out.println("you are a teenager");
		}
		else if (age>=20 && age<=110) {
			System.out.println("you are a adult");
		}
		else {
			System.out.println("invalid input");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
