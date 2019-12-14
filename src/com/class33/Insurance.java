package com.class33;

public abstract class Insurance {
	/*
	 * Create  a  class  Insurance  that  will  have  
	 * an attribute as insuranceName and unimplemented behaviour  
	 * as  getQuote  and  cancelInsurance. 
	 * Create 3 subclasses Car, Pet, Health. 
	 * Car class has it’s own attribute as carModel and Class Pet has petType  attribute.  
	 * Create  3  objects  of  the  sub classes  and  store  them  in  ArrayList.  
	 * Using  for loop/advanced  for  loop/  iterator  access  all methods of the class. 
	 */
	String insuranceName;
	 public abstract void getQuote();
	 public abstract void cancelInsurance();
	 
}
class Car extends Insurance{

	@Override
	public void getQuote() {
		System.out.println("Your insurance depent on your driving history");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("You can cancel you Insurance Policy any time ");
	}
}
class Pet extends Insurance{

	@Override
	public void getQuote() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelInsurance() {
		// TODO Auto-generated method stub
		
	}
	
}
class Health extends Insurance{

	@Override
	public void getQuote() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelInsurance() {
		// TODO Auto-generated method stub
		
	}
	
}
