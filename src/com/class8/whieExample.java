package com.class8;

import java.util.Scanner;

public class whieExample {

	public static void main(String[] args) {
		/*
		 * lests ask user to enter if it raining or not(true/false)
		 * as long as there is rain lets tell user to take an umbrella
		 * as soon as there is no rain --> you can go to the park
		 */
		
		Scanner scan= new Scanner(System.in);
		boolean isRain;
		
		do {
			System.out.println("Is it Raining");
			isRain = scan.nextBoolean();
		}while(isRain);
		
		System.out.println("Go to the park");
		
		
		
	}
	

}
