package com.class27;

public class Animal {
	
	public static void whoamI() {
		System.out.println("I am an animal");
	}

}
class Monkey extends Animal{
	//cannot override static method with instance methods
	//public void whoamI() 
	//method hiding 
	public static void whoamI() {
		System.out.println("I am a monkey");
	}
		
	
}