package com.class29;



public abstract class Vehicle {
		public void drive() {
			System.out.println("Vechile can be driven");
		}
		public void stop() {
			System.out.println("Vechile can stop when needed");
		}
		public abstract void start();
		public abstract void speed();
		

	}
	abstract class Car extends Vehicle{
		public void speed() {
			System.out.println("Max speed is 350 mph");
		}
		public abstract void breaking();
		
	}
	class BMW extends Car{

		@Override
		public void start() {
			System.out.println("BMW has a remote start");
			
		}

		@Override
		public void breaking() {
			System.out.println("BMW has advanced breaking system");
		}
			
	}
	
