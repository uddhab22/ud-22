package com.class24;

public class ThisWithConstructor {
	
	ThisWithConstructor() {
		System.out.println("I am non argument");
	}
	ThisWithConstructor(String str){
		this();
		System.out.println("I am constructor with 1 string parameters");
	}
	ThisWithConstructor(String str1, String str2){
		
		this("aa");
		System.out.println("I am a constructor with 2 parameters");
	}

	public static void main(String[] args) {
		ThisWithConstructor obj = new ThisWithConstructor("Hello");
		
		System.out.println("===================================");
		ThisWithConstructor obj1 = new ThisWithConstructor("aaa", "bbb");

	}

}
