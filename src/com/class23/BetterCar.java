package com.class23;


public class BetterCar {
	public static String make ;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	BetterCar(String carModel, String carColor, int carSpeed, int carDoors){
		model =carModel;
		color =carColor;
		speed =carSpeed;
		doors=carDoors;
		
		
	}
	
	public void getDetails() {
		System.out.println("I build "+color+" "+make+" "+model);
		System.out.println("My car has "+doors+" doors and has a maximum speed of "+speed+" mph");
	
	}
	
	
	public static void main(String[] args) {
		make ="BMW";
		BetterCar betterCar = new BetterCar("Z10","White",220,2);
		betterCar.getDetails();
		BetterCar bCar = new BetterCar("X5", "Black", 180, 5);
		bCar.getDetails();
		
	}
	

}
