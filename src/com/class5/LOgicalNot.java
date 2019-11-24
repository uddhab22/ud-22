package com.class5;

public class LOgicalNot {

	public static void main(String[] args) {
		boolean b1=!true;
		boolean b2=!false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		boolean traffic=true;
		
		if (!traffic) {
			System.out.println("Hello");
		}
		else {
			System.out.println("bye");
		}
		
		boolean isRain=false;
		
		if (!isRain) {
			System.out.println("Take umberella");
		}
		else {
			System.out.println("dont take umberella");
		}
		
		// lets compare 2 number using not operator
		
		int n1=10;
		int n2=10;
		
		if (n1==n2) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		if (!(n1==n2)) {
			System.out.println("not equal");
		}
		else {
			System.out.println("equal");
		}
		
		// if name is not 
		String name= "aud";
		String name1="sab";
		
		if (!(name.equals("Samin") || name1.equals("Ashma"))) {
			System.out.println("You are not my sister");
		}
		else {
			System.out.println("you are my sister");
		}
			
	}
	

}
