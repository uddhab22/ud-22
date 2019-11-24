package com.class7;

public class WhileLoopPractice {

	public static void main(String[] args) {
		/*
		 * print numbers 1 to 20
		 * 
		 */
		int i = 1;
		while (i<=20) {
			System.out.println(i);
			i++;
		}
		// print 10 to 30 in one line
		int x=10;
		while (x<51) {
			System.out.print(x+" ");
			x++;
		}
		System.out.println("-----------------------------------------");
		int a=50;
		while (a>=20) {
			System.out.print(a+" ");
			a--;
		}
		System.out.println("*******************************************");
		System.out.println("*******************************************");
		
		//print all even number 1 to 20
		
		int z =2;
		while (z<21) {
			System.out.print(z+" ");
			z+=2;
		}
		System.out.println("*****************");
		System.out.println("*******************************************");
		 int q =1;
		 while (q<21) {
			 if (q%2==0) {
				 System.out.print(q+" ");
			 }
			 q++;
		 }
		 System.out.println("*****************");
		 System.out.println("*******************************************");
		 
		 // print odd number from 50 to 100
		 // print even from 100 to 1
		 
		 int c =50;
		 int d = 100;
		 while (c<101) {
			 if (c%2!=0) {
				 System.out.print(c+" ");
			 }
			 c++;
		 }
		 System.out.println("*****************");
		 System.out.println("*******************************************");
		 
		 while (d>=1) {
			 if (d%2==0) {
				 System.out.print(d+" ");
			 }
			 d--;
			 
		 }
		 System.out.println("*****************");
		 System.out.println("*******************************************");
		 
		 
			
	}

}
