package com.class23;

public class Task2 {
	/*
	 * Write a java program of Class Students that 
	 * takes students name and 3 subject grades. 
	 * Inside your class also have a method to Calculate Average Grade. 
	 * Test Student class for 5 different students with different marks. 
	 * Your program should print an average mark of each students name.
	 */	
	public String name;
	public int marks;
	public int avg;
	
	Task2 (String StudentName, int mark1, int mark2, int mark3){
		name = StudentName;
		marks = mark1+mark2+mark3;
		avg = marks/3;
	}	
	public void getAvg() {
		System.out.println(name+" has a average of "+avg);
		System.out.println();		
	}
	public static void main(String[] args) {
		Task2 s1 = new Task2("John", 88, 90, 73);
		s1.getAvg();
		Task2 s2 = new Task2("James", 67, 71, 79);
		s2.getAvg();
		Task2 s3 = new Task2("Dan", 93, 56, 73);
		s3.getAvg();
		Task2 s4 = new Task2("Jim", 90, 89, 65);
		s4.getAvg();
		Task2 s5 = new Task2("Juan", 79, 76, 99);
		s5.getAvg();	
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
