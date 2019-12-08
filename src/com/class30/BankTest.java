package com.class30;

public class BankTest {

	public static void main(String[] args) {
		CapitalOneChild bank1 = new CapitalOneChild();
		bank1.checking();
		bank1.saving();
		bank1.financing();
		bank1.trust();
		System.out.println("======================================");
		
		BOA bank2 = new BOA();
		bank2.saving();
		bank2.checking();
		bank2.trust();
		bank2.financing();
		             
	}

}
