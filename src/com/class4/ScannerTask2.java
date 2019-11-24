package com.class4;

import java.util.Scanner;

public class ScannerTask2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age= input.nextInt();
		
		if (age>=18) {
			System.out.println("You will get your driver's licence today18.");
		}
		else {
			System.out.println("Take a learners permit for now and come back when you are 18 years old.");
		}

	}

}
