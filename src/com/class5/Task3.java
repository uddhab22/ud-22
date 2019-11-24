package com.class5;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter your quiz score");
		double q = input.nextDouble();
		System.out.println("enter your mid-term score");
		double m = input.nextDouble();
		System.out.println("enter your final score");
		double f = input.nextDouble();
		double average= (q+m+f)/3;
		
		
		if (average >=90) {
			System.out.println("Your grade is A");
		}
		else if (average >=70 && average<90) {
			System.out.println("Your grade is B");
		}
		else if (average >=50 && average<70) {
			System.out.println("Your grade is C");
		}
		else if (average < 50) {
				System.out.println("Your grade is F");
		}
		else {
			System.out.println("Invalid score");
		}
		
	}

}
