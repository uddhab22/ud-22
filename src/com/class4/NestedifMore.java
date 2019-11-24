package com.class4;

public class NestedifMore {

	public static void main(String[] args) {
		/* check age, if age is less than 16--> you are too young to drive
		 * otherwise --> you are eligible to drive & we will check
		 * if you are older than 18 --> you can get driver's license and if not 
		 * you can get driver permit.
		 * 
		 */
		
		int age =100;
		if (age>=90) {
			System.out.println("Its better not to drive");
		}
		else if (age<16) {
			System.out.println("You are too young to drive.");
		}
		else {
			System.out.println("Your are eligible to drive.");
			if (age>=18) {
				System.out.println("You can drive alone.");
			}
			else {
				System.out.println("You need your parents when you drive.");
			}
		}
		
		
		
		
		
		
		
		
	}

}
