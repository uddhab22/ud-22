package com.class19;

public class TestAllMethods {

	public static void main(String[] args) {
		// find the largest from 300 and 500
		// then identify is the largest number is odd
		// call method weekdayname
		//if output is tue, thu, sat and sunday== print i am learning java
		
		Allmethods obj = new Allmethods();
		int large = obj.findLargest(300, 500);
		System.out.println(large);
		boolean odd =obj.isodd(large);
		System.out.println(odd);
		String day = obj.weekDayName(7);
		if(day.equals("Tuesday")||day.equals("Thursday")|| day.equals("Saturday")||day.equals("Sunday")) {
			System.out.println("I am learning JAVA!");
		}
		else {
			System.out.println("No Class!");
		}
		
		System.out.println(day);
	}

}
