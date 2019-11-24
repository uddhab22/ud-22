package com.class4;

import java.util.Scanner;

public class ScannerTask1 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		System.out.println("What is the amount of loan you need?");
		
		double d = input.nextDouble();
		
		if (d<2000000) {
			System.out.println("Your loan is approved.");
		}
		else {
			System.out.println("Your loan is rejected");
		}
	}

}
