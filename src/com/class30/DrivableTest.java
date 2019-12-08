package com.class30;

public class DrivableTest {

	public static void main(String[] args) {
		Drivable obj = new Toyota();
		obj.drive();
		
		//obj.DRIVE_FAST=false; final value cannot be reassigned
		
		Toyota obj1 = new Toyota();
		obj1.drive();
		obj1.stop();
	}

}
