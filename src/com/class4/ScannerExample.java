package com.class4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter any number");
		/*nextInt(): only for numbers
		 * nextLine(): for Strings
		 * nextDouble(): decimales value
		 */
		int num = scan.nextInt();
		System.out.println("Entered number is "+num);
		
		
		
	}

}
