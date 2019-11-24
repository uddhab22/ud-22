package com.class3;

public class IFElseIf {

	public static void main(String[] args) {
		
		int n1=100;
		int n2=101;
		
		if (n1>n2) {
			System.out.println("N1 is larger than N2.");
		}
		if (n1==n2) {
			System.out.println("N1 is same as N2");
		}
		else {
			System.out.println("N1 is smaller than N2.");
		}
		
		int d=9;
		
		if (d==1) {
			System.out.println("Today is Monday");
		}
		else if (d==2) {
			System.out.println("Today is Tuesday");
		}
		else if (d==3) {
			System.out.println("Today is Wednesday");
		}
		else if (d==4) {
			System.out.println("Today is Thusday");
		}
		else if (d==5) {
			System.out.println("Today is Friday");
		}
		else if (d==6) {
			System.out.println("Today is Saturday");
		}
		else if (d==7) {
			System.out.println("Today is Sunday");
		}
		else {
			System.out.println("Please input day between 1 -7");
		}
		// command+shif+f
	}

}
