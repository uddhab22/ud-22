package com.class6;

import java.util.Scanner;

public class ScannerSwitch {

	public static void main(String[] args) {
		/*
		 * ask which country are you from
		 * based on country we will specify favorite food
		 */
		
		String country;
		String foodName ="";
		Scanner input;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your country");
		country = input.nextLine();
		
		switch(country) {
		
		case "Turkey":
			foodName = "kebab";
			break;
		case "Ethiopia":
			foodName = "Tibs";
			break;
		case "Morocco":
			foodName = "Tajin";
			break;
		case "Kazakhstan":
			foodName = "Kumis";
			break;
		case "Pakistan":
			foodName = "Beryani";
			break;
		case "Russia":
			foodName = "Caviar";
			break;
		case "Cuba":
			foodName = "sofrito";
			break;	
			
		default:
			foodName="Unknown";	
		
		}
		
		System.out.println("You are from "+country+" and your favorite food is "+foodName);
		
		
	}

}
