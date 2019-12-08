package com.class30;

public interface Drivable {
	// public static final variables by default and declare a value as well. 
	boolean DRIVE_FAST = true;
	// by default in interface, compiler add public abstract for us in the methods
	  void drive();	 
}
class Cars{
	public void stop() {
		System.out.println("Car has stop sensors");
	}
}
class Toyota extends Cars implements Drivable{

	@Override
	public void drive() {
		System.out.println("Toyota is ready for test drive");
	}
	
}
