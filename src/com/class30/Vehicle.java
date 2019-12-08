package com.class30;


public abstract class Vehicle {
	
	String vinNumber;
	static int totalVehicle;
	
	Vehicle(String vinNumber){
		this.vinNumber= vinNumber;
		totalVehicle++;
		
	}
	public void drive() {
		System.out.println("Vechile can be driven");
	}
	public void stop() {
		System.out.println("Vechile can stop when needed");
	}
	public static void displayTotal() {
		System.out.println("Total vehicles we build "+totalVehicle);
	}
			
	public abstract void start();
	public abstract void speed();
	

}
abstract class Car extends Vehicle{
	String carType;
	
	Car(String vinNumber, String carType) {
		super(vinNumber);
		this.carType = carType;
		
	}
	public void speed() {
		System.out.println("Max speed is 350 mph");
	}
	public abstract void breaking();
	
}
class BMW extends Car{
	
	String make, model;
	BMW(String vinNumber, String carType, String make, String model) {
		super(vinNumber, carType);
		this.make=make;
		this.model=model;
		
	}
	@Override
	public void start() {
		System.out.println("BMW has a remote start");	
	}
	@Override
	public void breaking() {
		System.out.println("BMW has advanced breaking system");
	}
	public void display() {
		System.out.println("We build "+carType+" "+make+" "+model+" with vin# "+vinNumber);
	}
}

