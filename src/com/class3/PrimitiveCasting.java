package com.class3;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		double d=12;
		System.out.println(d);
		//widening casting
		byte b = 127;
		int i= b;
		System.out.println(i);
		
		int n=123;
		double d1 =n;
		System.out.println(d1);
		
		
		//narrow casting
		double d2= 123.56;
		int n2= (int)d2;
		System.out.println(n2);
		
		int n3=200;
		byte b1= (byte)n3;
		
		System.out.println(b1);
	}

}
