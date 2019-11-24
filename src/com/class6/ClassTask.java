package com.class6;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		/*
		 * ask user to emter the month of birth
		 * based on the month define season
		 * if march,april, and may --> spring
		 * if june july agu--> summer
		 * sep, oct, nov --> fall
		 * dec, jan, feb--> winter
		 * otherwise unknown
		 * at the end of the program
		 * "Your are born in _____"
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month of your birth, Jan to Dec");
		String month = scan.nextLine();
		String season;
		
		if (month.equals("Jan")|| month.equals("Dec")|| month.equals("Feb")) {
			season="Winter";
		}
		else if (month.equals("Mar")|| month.equals("Apr")|| month.equals("May")) {
			season="Spring";
		}
		else if (month.equals("Jun")|| month.equals("Jul")|| month.equals("Aug")) {
			season="Summer";
		}
		else if (month.equals("Sep")|| month.equals("Oct")|| month.equals("Nov")) {
			season="Fall";
		}
		else {
			season="Unknown";
		}
		System.out.println("You are born in "+season);
		System.out.println(month);
		
		
		
		
		
	}

}
