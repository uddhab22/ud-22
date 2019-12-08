package com.class26;

public class FullTime extends Employee {
	
	int bonus;
	
	public void getPaid() { //overridden
		System.out.println("Full time employee get paid "+salary+" and "+bonus+" bonus.");
	}
	

}
