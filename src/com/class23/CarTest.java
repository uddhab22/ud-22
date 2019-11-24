package com.class23;

public class CarTest {

	public static void main(String[] args) {
		Car.make="Toyota";
		
		Car Car1 = new Car();
		Car1.model = "Camry";
		Car1.color = "Black";
		Car1.doors = 2;
		Car1.speed = 150;
		Car1.getDetails();
		
		Car Car2 =new Car();
		Car2.model = "RAV4";
		Car2.color = "White";
		Car2.doors = 4;
		Car2.speed = 170;
		
		Car2.getDetails();
		
		BetterCar betterCar1 = new BetterCar("pirus","Black",180,4);
		betterCar1.getDetails();
		
	}

}
