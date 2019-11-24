package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		/*
		 * ask user to enter name 5 times
		 * and our output should be "Good Afternoon ______"
		 */
		
		Scanner input = new Scanner(System.in);
		int i =1;
		
		while (i<=5) {
		System.out.println("Please enter your name");
		
		String name = input.nextLine();
		
		System.out.println("Good Afternoon "+name);
		i++;
		
		
		}
		

	}

}
