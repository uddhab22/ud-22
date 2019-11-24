package com.class13;

public class RegulationExpression {

	public static void main(String[] args) {
		
		String str ="1423He34ll4567o98760";
		
		System.out.println(str);
		System.out.println();
		System.out.println("Remove only numbers from the string");
		System.out.println(str.replaceAll("[0-9]", ""));
		System.out.println("====================================");
		System.out.println();
		System.out.println("Remove only text form the string");
		System.out.println(str.replaceAll("[^0-9]", ""));
		System.out.println();
		System.out.println("==========================");
		System.out.println("Remove only text form the string 2nd method");
		System.out.println(str.replaceAll("[a-zA-Z]", ""));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
