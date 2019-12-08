package com.class30;

public class VehicleTest {

	public static void main(String[] args) {
		BMW car1 = new BMW("123456789-12f", "Sedan", "BMW", "Z6");
		car1.display();
		car1.drive();
		car1.stop();
		car1.speed();
		car1.start();
		car1.breaking();
		car1.displayTotal();
		System.out.println("=======================================");
		
		Vehicle car2 = new BMW("123", "suv", "bmw", "z8");
		car2.drive();
		car2.stop();
		car2.start();
		car2.speed();
		car2.displayTotal();
		System.out.println("==================================");
		
		Car car3 = new BMW("123H345", "Cupe", "Madza", "M5");
		car3.displayTotal();
		System.out.println("======================================");
		
		BMW c4 = new BMW("", "", "", "");
		c4.displayTotal();
	
	}

}
