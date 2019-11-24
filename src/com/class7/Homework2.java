package com.class7;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*ask user to pay for coffee
		 * you need to keep asking user to pay for it until entered price is equal to 5
		 * after user paid then say "Enjoy you coffee!"
		 */
		Scanner scan = new Scanner(System.in);
		double cost;
		
		do {
			System.out.println("pay for your cofee");
			cost = scan.nextDouble();
		}
		
		while (cost!=5.0);
		
		System.out.println("Enjoy your cofee");
	}

}
