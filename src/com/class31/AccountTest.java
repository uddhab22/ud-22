package com.class31;

public class AccountTest {

	public static void main(String[] args) {
	
		
		Account acc = new Account();
		//acc.accNumber= 1911010990;
		//acc.balance=123456.000;	
		
		acc.setAccountNumber(999999999);
		long accountNum = acc.getAccountNumber();
		System.out.println(accountNum);
		
		acc.setBalance(200.98);
		double accBalance = acc.getBalance();
		System.out.println(accBalance);
		
		int num =123;
		System.out.println(String.valueOf(num).charAt(1));
		
		
		
	}
}
