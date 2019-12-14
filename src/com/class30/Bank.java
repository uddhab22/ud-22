package com.class30;

public interface Bank {
	void checking();
	void saving();
}
 interface Trustabel{
	void trust();
}
class Finance{
	public void financing() {
		System.out.println("Financial trasaction like loan is done ");
	}
}
class BOA extends Finance implements Bank, Trustabel{

	@Override
	public void checking() {
		System.out.println("Bank of America has Checking Account ");
		
	}

	@Override
	public void saving() {
		System.out.println("Bank of America has Saving Account");
		
	}

	@Override
	public void trust() {
		System.out.println("BOA is trustable");		
	}
}
class CapitalOne extends Finance implements Bank, Trustabel{
	

	@Override
	public void checking() {
		System.out.println("CapitalOne has Checking Account ");
		
	}

	@Override
	public void saving() {
		System.out.println("CapitalOne has Saving Account");
		
	}

	@Override
	public void trust() {
		System.out.println("CapitalOne is trustable");
		
	}
}
class CapitalOneChild extends CapitalOne{
	
}