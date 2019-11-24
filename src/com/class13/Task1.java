package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your class day:");
		
		String day = scan.nextLine();
		
		if (day.equalsIgnoreCase("Saturday")) {
			System.out.println("Saturday is for Java class.");
		}
		else if (day.equalsIgnoreCase("Sunday")) {
			System.out.println("Sunday is for Java class.");
		}
		else if (day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Thursday")) {
			System.out.println("It is the day for Git class.");
		}
		else {
			System.err.println("No class.");
		}
		scan.close();
		
		
		
		
		
		
	}

}
