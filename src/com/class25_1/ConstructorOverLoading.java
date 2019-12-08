package com.class25_1;

public class ConstructorOverLoading {
	
	ConstructorOverLoading() {
		System.out.println("I am non - argumente constructor");
		
	}
	ConstructorOverLoading (String str){
		System.out.println("I am constructor with 1 string parameter");
	}
	ConstructorOverLoading(int n1){
		System.out.println("I am constructor with 1 integer paramater");
	}
	
	public static void main(String[] args) {
		ConstructorOverLoading con = new ConstructorOverLoading("bbb");
	}
	
	
	
	
}
