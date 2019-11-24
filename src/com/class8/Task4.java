package com.class8;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * ask user to apply for credit card 10 times
		 * break when input is yes
		 */
		Scanner input = new Scanner(System.in);
		int i;
		
		for(i=1; i<11; i++) {
			System.out.println(" Apply for a credit card");
			String apply= input.nextLine();
			if(apply.equalsIgnoreCase("yes")){
				break;
			}
			
		}
		System.out.println(".....");
		
		
		
		
		
		
		
		
	}

}
