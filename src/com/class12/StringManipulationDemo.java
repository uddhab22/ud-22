package com.class12;

public class StringManipulationDemo {

	public static void main(String[] args) {
		
		
		// 1st method of declaring and assigning value in string
		
		
		String str= "John";
		System.out.println(str);
		System.out.println();
		System.out.println("length "+str.length());
		System.out.println();
		
		//2nd method of declaring and assigning value in string
		
		System.out.println("***** 2nd way of String manipulation *******");
		String str1 = new String("James");
		System.out.println();
		System.out.println(str1);
		System.out.println();
		System.out.println("length "+str1.length());
		System.out.println();
		
		//string to lower class
		
		System.out.println("-------everything in lower case------------- ");
		System.out.println();
		String str3 ="AbCdEfGhIjKlMnOpQrStUvWxYz";
		System.out.println(str3.toLowerCase());
		System.out.println();
		
		
		// string to upper case
		
		System.out.println("-------everything in upper case------------- ");
		System.out.println();
		System.out.println(str3.toUpperCase());
		System.out.println();
		System.out.println("=============================================");
		System.out.println();
		
		
		// ignore case  .equalsIgonereCase();
		
		String str4="abcdefghijklmnopqrstuvwxyz";
		System.out.println("ignore case and equate str3 and str4");
		System.out.println();
		System.out.println(str3.equalsIgnoreCase(str4));
		System.out.println("=============================================");
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
}
