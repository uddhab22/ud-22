package com.class9;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Write a guessing game where the user has to 
		 * guess a secret number between 1 and 20. 
		 * After every guess input, the program tells the user 
		 * whether their number was too large or too small. 
		 * The program will keep asking the user to enter the number 
		 * until he finds the correct number. 
		 * When the correct answer is found the 
		 * system should display “Congratulations!!. You got it!”
		 * 
		 */
		
		Scanner scan = new Scanner (System.in);
		int n;
		 do{
			 
			 System.out.println("Guess the secret number between 1 to 20");
			  n = scan.nextInt();
			 
			 if (n<=6) {
					System.out.println("The number is too small");
				}
				else if (n==7) {
					System.out.println("Congratulations!!. You got it!");
				}
				else if (n<1||n>20) {
					System.out.println("Number not in range");
				}
			 
				else {
					System.out.println("The number is too large");
				}
			
			 System.out.println();
				
		 }while(n!=7);
		 
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
