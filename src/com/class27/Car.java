package com.class27;

public class Car {
	String Make, Model;
	int year;
	
	Car(){
		System.out.println("I am non argument constructor");
	}
	
	public void display() {
		System.out.println("We build "+year+" "+Make+" "+Model);
	}
	public static void main(String[] args) {
		Car car = new Car();
		//System.out.println();
		car.Make="Ford";
		car.Model="Focus";
		car.year = 2015;
		car.display();
		System.out.println("============== OBJ of CHILD CLASS ===================");
		Tesla tesla = new Tesla();
		tesla.Make="Tesla";
		tesla.Model="S";
		tesla.year=2019;
		tesla.display();
	}

}
class Tesla extends Car{
	boolean autoPiolt;
	Tesla(){
		super();
		System.out.println("I am non argument constructor of child class");
	}
	
}
