package com.class25_1;

public class Addition {
	public void add( int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	
	public void add(int n1, int n2, int n3) {
		System.out.println(n1+n2+n3);
	}
	
	public void add(double n1, double n2) {
		System.out.println(n1+n2);
	}
	
	public void add(double n1, int n2) {
		System.out.println(n1+n2);
	}
	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.add(12, 122);
		obj.add(19, 16, 99);
		obj.add(0.2, 2.99);
		obj.add(10.01, 10);
				
	}
	
	
}
