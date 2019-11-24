package com.class5;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		/*7 days a week
		 * if day is 2 or 4 --> SDLC
		 * if day 6 or 7 --> Java coding
		 * day 1 or 5 --> no class
		 * if day is 3 -- Review class
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("enter the day in number");
		int n = input.nextInt();
		
		if (n==2 || n==4) {
			System.out.println("We have SDLC class");
		}
		else if (n==6 || n==7) {
			System.out.println("We have JAVA class");
		}
		else if (n==1 || n==5) {
			System.out.println("We have NO class");
		}
		else if (n==3) {
			System.out.println("We have Review class");
		}
		else {
			System.out.println("not a valid input");
		}		
		
	}

}
