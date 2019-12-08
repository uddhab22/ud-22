package com.class26;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.sleep();
		ani.eat();
		System.out.println("=================");
		
		cat obj = new cat();
		obj.eat();
		obj.sleep();
		obj.meow();
		
		System.out.println("=====================");
		
		Animal c2 = new cat();
		c2.eat();
		c2.sleep(); // this part is run time polymorphisim 
		//c2.meow();
		
		
		
	}
}
