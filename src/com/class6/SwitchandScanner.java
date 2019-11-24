package com.class6;

import java.util.Scanner;

public class SwitchandScanner {
	public static void main(String[] args) {
		/*
		 * ask user gender F or M
		 * if F--> Female
		 * if M--> Male
		 * otherwise unknown
		 * 
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your gender: F or M");
		char gender = input.next().charAt(0);
		String userGender;
		
		switch(gender) {
		
		case 'F':
			userGender="Female";
			break;
		case 'M':
			userGender ="Male";
			break;
		default:
			userGender = "Unknown";
		
		}
		
		System.out.println("your gender is "+userGender);
	}

}
