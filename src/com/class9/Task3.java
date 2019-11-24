package com.class9;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads a range of integers (start and end point), 
		 * provided by a user and then from that range prints 
		 * the sum of the even and odd integers.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the start point of integer");
		int start = scan.nextInt();
		System.out.println("Enter the end point of integer");
		int end= scan.nextInt();
		int startNum;
		int endNum;
		
		if (start<end) {
			startNum=start;
			endNum= end;
		}
		else {
			startNum=end;
			endNum= start;
		
			
		}
		
		
		int sumOdd=0;
		int sumEven=0;
		
		for (int x=startNum; x<=endNum; x++) {
			if (x%2==0) {
				sumEven=sumEven+x;
			}
			else {
				sumOdd=sumOdd+x;
				
			}
		}
		
		
		
		System.out.println("The sum of odd number is "+sumOdd);
		System.out.println();
		System.out.println("The sum of even numberis "+sumEven);
		
	}

}
