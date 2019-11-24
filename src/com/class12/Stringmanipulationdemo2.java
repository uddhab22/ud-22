package com.class12;

public class Stringmanipulationdemo2 {

	public static void main(String[] args) {
		
		String str1="It was raning";
		
		System.out.println(str1.contains("was"));
		System.out.println("===============================================");
		System.out.println();
		
		// task
		// create 2 strings and initalise them with some value
		// implement the following method on those
		
		
		
		String s1="Aa,Bb,Cc,Dd,Ee,Ff,Gg,Hh,Ii,Jj";
		String s2 = "aa,bb,cc,dd,ee,ff,gg,hh,ii,jj";
		
		System.out.println("Length of String s1 is");
		System.out.println(s1.length());
		System.out.println("===============================================");
		System.out.println();
		
		
		System.out.println("Equating String S1 and S2");
		System.out.println(s1.equals(s2));
		System.out.println("===============================================");
		System.out.println();
		
		
		System.out.println("Equating s1 and s2 after ingoring case");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println("===============================================");
		System.out.println();
		
		
		System.out.println("Checking for content aa in S2");
		System.out.println(s2.contains("aa"));
		System.out.println("===============================================");
		System.out.println();
		
		
		System.out.println("s1 to lower case");
		System.out.println(s1.toLowerCase());
		System.out.println("===============================================");
		System.out.println();
		
		
		System.out.println("s2 to upper case");
		System.out.println(s2.toUpperCase());
		System.out.println("===============================================");
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
