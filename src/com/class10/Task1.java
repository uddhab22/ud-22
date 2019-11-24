package com.class10;

public class Task1 {

	public static void main(String[] args) {
		
		
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println("Your grade is "+grade[1]);
		System.out.println("------------------------------");
		
		
		char[] gradeNew = {'A','B','C','D','E','F'};
		int a=2;
		System.out.println("Your grade is "+gradeNew[a]);
		System.out.println("------------------------------");
		
		for (int x=0;x<gradeNew.length; x++) {
			System.out.println(gradeNew[x]);
		}
		
	}

}
