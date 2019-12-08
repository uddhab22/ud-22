package Relp.practise;

import java.util.Scanner;

public class HW165 {
	
/*
 * Create a final method. 
 * the final method should have no return type. 
 * What i want for you to do is in the final method 
 * create logic to reverse 2 numbers. 
 * for instance a=12 and b =10. 
 * i want b to have the value of 12 and 
 * a to have the value of 10. 
 * DO NOT REASSIGN the values, 
 * you must create logic where they both swap numbers
	THIS IS A SCANNER INPUT.
 */
	
	public void finalMethod() {
		Scanner scan1 = new Scanner(System.in);
		int a = scan1.nextInt();
		Scanner scan2 = new Scanner(System.in);
		int b = scan2.nextInt();
		
		int c = a+b;
		int d = c-b;
		int e = c-a;
		System.out.println("a is now assigned value of "+e);
		System.out.println("b is now assigned value of "+d);
			
	}
	public static void main(String[] args) {
		HW165 obj= new HW165();
		
		obj.finalMethod();
		
	}

}
