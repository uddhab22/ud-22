package com.class26;

public class Animal {
	public void sleep() {
		System.out.println("Animal sleep");
	}
	public void eat() {
		System.out.println(" Animal eat");
	}
}

	class cat extends Animal{
		public void sleep() {
			System.out.println("I sleep all day");
		}
		public void meow() {
			System.out.println("I mewo ");
		}
	}
