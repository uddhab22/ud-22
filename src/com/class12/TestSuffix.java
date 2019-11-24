package com.class12;

public class TestSuffix {

	public static void main(String[] args) {
		
		String str = "It is very hot today";
		System.out.print("This string start with IT = ");
		System.out.println(str.startsWith("It"));
		System.out.println();
		System.out.println("=================================================");
		System.out.print("This string start with IT with index 0 = ");
		System.out.println(str.startsWith("It", 0));
		System.out.println();
		System.out.println("==================================================");
		
		System.out.print("This string ends with today = ");
		System.out.println(str.endsWith("today"));
		
		
		
		
	}

}
