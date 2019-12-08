package com.class28;

public class Circle extends Shape{

	Circle(int radius) {
		super(radius);
		
	}
	public void area() {
		double areaCir = 3.14*radius*radius;
		System.out.println("The area of circle is "+areaCir);
	}
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		c1.area();
	}
}
