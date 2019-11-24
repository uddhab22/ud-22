package com.class5;

import java.util.Scanner;

public class ClassMode {

	public static void main(String[] args) {
		/*
		 * Write a program to determine the classMode.
		 * ●If there is no rain → classMode=”In Class”,
		 * otherwise classMode → “Online”.
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Is it raining? true or false");
		boolean isRaining = input.nextBoolean();
		
		if (isRaining) {
			System.out.println("It is raining, we will have Online class today.");
		}
		else {
			System.out.println("It is not raining, we will have In Class today.");
		}		
	}
	

}
