package com.class28;

public class Car {
	String make, model;
	
	Car (){
		System.out.println("I am a non argument constructor");
	}
	Car (String make, String model){
		this.make=make;
		this.model=model;
		
	}
}
class Tesla extends Car{
	boolean autopilot;
	Tesla (){
		super();// default, done behind if we do not do it manually.
		System.out.println("I am a child non argument constructor");
	}
	Tesla (String make,String model,boolean autopilot){
		super(make,model);
		this.autopilot=autopilot;
		
	}
	public void displayInfo() {
		System.out.println("Car "+make+" "+model+" has an autopilot "+autopilot);
	}
}
