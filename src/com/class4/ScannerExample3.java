package com.class4;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		
		
		
		System.out.println("Please enter first number");
		int n1 = keyboard.nextInt();
		
		System.out.println("please enter 2nd number.");
		int n2= keyboard.nextInt();
		
		if (n1==n2) {
			System.out.println(n1+" is equals to "+n2);
		}
		
		else if (n1>n2) {
			System.out.println(n1+" is larger than "+n2);
			
		}
		else {
			System.out.println(n1+" is smaller than "+n2);
			
		}
	
	}

}
