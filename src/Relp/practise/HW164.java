package Relp.practise;

import java.util.Scanner;

public class HW164 {
	
	/*
	 * Create a final method and name it reverseString with a return type of String. 
	 * when you call the method and enter the string parameter, 
	 * the method should return my string. 
	 * implement a scanner class to reverse the string.
	 */
	static String str;
	static char reverseString;
	
	public final static String reverseString() {
		for (int i=str.length()-1;i>=0;i--) {
			reverseString = str.charAt(i);
			System.out.print(reverseString);
		}
		
		return null;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		str= scan.nextLine();
		reverseString();
		
	}
	
	

}
