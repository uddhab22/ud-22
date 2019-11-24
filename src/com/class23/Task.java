package com.class23;

public class Task {
	
	
	/*
	 * Write a program that will have a constructor: 
	 * one with parameters and second without any parameters. 
	 * Create a separate Test class where you will 
	 * execute both of the constructors.
	 * 
	 */
	Task(int x, int y){
		int z = x+y;
		System.out.println(x+" + "+y+" = "+z);
	}
	
	Task(){
		System.out.println("Constructor without parameter");
	}

}
