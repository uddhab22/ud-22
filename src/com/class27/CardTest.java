package com.class27;

public class CardTest {

	public static void main(String[] args) {
		
		Card card2 = new Master();
		card2.creditLimit();
		card2.chargeInterest();
		System.out.println("==================================");
		
		Card card1 = new Amex();
		card1.creditLimit();
		card1.chargeInterest();
		System.out.println("=================================");
		
		Card card3 = new Visa();
		card3.chargeInterest();
		card3.creditLimit();
		System.out.println("======================================================");
		
		Card[] cardArray = {new Master(),new Amex(),new Visa(),new Discover()};
		
		for (Card mycard:cardArray) {
			mycard.creditLimit();
			mycard.chargeInterest();
			System.out.println();
			
		}

}
}
