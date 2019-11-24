package com.class7;

import java.util.Scanner;

public class hw7Whileuse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please pay for your coffee");
		double cost = scan.nextDouble();
		
		while(cost!=5) {
			System.out.println("please pay for your coffee");
			cost = scan.nextDouble();
		}
		System.out.println("enjoy your coffee");
	}

}
