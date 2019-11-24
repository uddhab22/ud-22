package com.class5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Prompt the user to enter person heights in inches. 
		 * Person should be classified as one of the following:
		 * 
			short (under 5 feet)
			medium(5 to 6 feet)
			tall (6 feet and over)
		 * 
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your height in inches");
		double d=input.nextDouble();
		
		if (d>0 && d<5) {
			System.out.println("You height is  short");
		}
		else if (d>5 && d<=6) {
			System.out.println("Your height is medium");
		}
		else if (d>6){
			System.out.println("You are tall");
		}
		else {
			System.out.println("invalid height");
		}
	}

}
