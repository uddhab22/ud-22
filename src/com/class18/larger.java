package com.class18;

public class larger {
	//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	
	void largest(int n1, int n2) {
		if (n1<n2) {
			System.out.println("The largerst number is "+n2);
		}
		else if (n1==n2) {
			System.out.println("The numbers are equal");
		}
		else {
			System.out.println("The largerst number is "+n1);
		}
		
	}

	public static void main(String[] args) {
		
		larger obj = new larger();
		obj.largest(6, 6);
		obj.even(7);
		obj.palindrome("noon");
		
	}
	//Create a method that will take a number and prints whether the number is even or odd.
	void even(int n) {
		if (n%2==0) {
			System.out.println("it is a even number");
		}
		else {
			System.out.println("It is odd number");
		}
	}
	//Create a method that will print whether given String is palindrome or not.
	
	void palindrome(String name) {
		String rev ="";
		int length = name.length();
		
		for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + name.charAt(i);
		if (name.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
