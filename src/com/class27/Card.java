package com.class27;




public class Card {
	public void chargeInterest() {
		System.out.println("Card charge 25% interest");
	}
	public void creditLimit() {
		System.out.println("Credit limit of the card is $5000.");
	}	
}
class Amex extends Card{
	public void creditLimit() {
		System.out.println("Credit limit for Amex card is $25000.");
	}
	
}
class Master extends Card{
	public void creditLimit() {
		System.out.println("Credit limit for Master Card is $15000.");
	}
	public void cashBack() {
		System.out.println("Master card has 3% cash back on all purchase.");
	}
	
}
class Visa extends Card{
	public void chargeInterest() {
		System.out.println("Visa card has 20.99% interest.");
	}
	
}
class Discover extends Card{
	public void applePay() {
		System.out.println("Discover card support apple pay.");
	}
}