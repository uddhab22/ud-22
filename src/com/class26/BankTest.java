package com.class26;

public class BankTest {

	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.money= 900;
		double fee =b1.chargeFee();
		System.out.println("The bank fee is "+fee);
		System.out.println("=========================");
		
		PNC b2 = new PNC();
		b2.money = 900;
		double pncFee = b2.chargeFee();
		System.out.println("The PNC bank fee is "+pncFee);
	}

}
