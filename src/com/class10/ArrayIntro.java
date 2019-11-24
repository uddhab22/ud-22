package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		 int[] num= {1,2,3,4,5,6,7,8,9,10,11};
		 int[] num1;
		 num1= new int[4];
		 num1[0]=1;
		 num1[1]=2;
		 num1[2]=3;
		 num1[3]=4;	 
		 System.out.print("No 1 print out: ");
		 System.out.println(num[9]+num1[3]);
		 System.out.println();
		 
		 String[] classes = {"java","sdlc","manual testing","GIT"};
		 String[] javaClass ;
		 javaClass = new String[5];
		 javaClass[0]="intro";
		 javaClass[1]="if else";
		 javaClass[2]="while, do while";
		 javaClass[3]="for loop";
		 javaClass[4]="array";
		 
		 
		 
		 System.out.print("No 2 print out: ");
		 System.out.println(classes[2]);
		 System.out.println();
		 System.out.println("No 3 print out: ");
		 System.out.println("Today we have "+classes[0]+" class and its rating out of 10 is "+num[9]);
		 System.out.println();
		 System.out.println("No 4 print out: ");
		 System.out.println("Today in the "+classes[0]+" class we are learning "+javaClass[4]);
	
	
	
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
