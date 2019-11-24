package com.class4;

import java.util.Scanner;

public class ScannerTask3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the temperature of your city?");
		double n1= input.nextDouble();

		
		System.out.println("Which city are you from?");
		String s1= input.next();
		
		
		System.out.println("The temperature of "+s1+" is "+ (n1-32)*0.556);
	}

}
