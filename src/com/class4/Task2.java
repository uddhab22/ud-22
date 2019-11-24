package com.class4;

public class Task2 {

	public static void main(String[] args) {
		double morRate= 4.7;
		double morPrice = 100000;
		
		if (morRate>4.5) {
			System.out.println("I don't want to buy house now.");
		}
		else {
			System.out.println("I will buy the house.");
			if (morPrice>200000) {
				System.out.println("I will take a loan.");
			}
			else {
				System.out.println("I will pay cash for it.");
			}
		}
		
	}

}
