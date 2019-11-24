package com.class15;

import java.util.Scanner;

public class Stringmanipulationtask {

	public static void main(String[] args) {
		// lets ask user to enter browser
		// based on the input
		// output --" Your selected browser is ___________"
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter browser name");
		String browser = scan.nextLine();
		
		
		
		switch(browser.toLowerCase()) {
		case "firefox":
			System.out.println("Your browser is "+browser);
			break;
			
		case "chrome":
			System.out.println("Your browser is "+browser);
			break;
		case "safari":
			System.out.println("Your browser is "+browser);
			break;
		default:
			System.err.println("Your browser is invalid");
			break;
			
		
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
