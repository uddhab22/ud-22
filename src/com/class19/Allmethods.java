package com.class19;

public class Allmethods {
	// create methods to return value of sum
	// create methods to return value of subtraction
	
	int sum(int n1, int n2) {
		int result = n1+n2;
		return result;
	}
	
	int sub(int a, int b) {
		int sub = a - b;
		return sub;
	}
	
	int multi(int a, int b) {
		int multi = a*b;
		return multi;
	}
	
	int div(int a, int b) {
		int div = a/b;
		return div;
	}
	int findLargest(int num1, int num2) {
        int largest;
        if (num1 > num2) {
            largest = num1;
        } else {
            largest = num2;
        }
        return largest;
	}
	
	boolean isodd(int num) {
		boolean isodd;
		if(num%2!=0) {
			isodd = true;
		}
		else {
			isodd = false;
		}
		return isodd;
	}
	
	/**
	 * method will take a week day number and return
	 * a week day name 
	 * @return 
	 */
	
	String weekDayName(int weekday) {
		String weekDayName;
		switch (weekday) {
		case 1:
			weekDayName = "Monday";
			break;
		case 2:
			weekDayName = "Tuesday";
			break;
		case 3:
			weekDayName = "Wednesday";
			break;
		case 4:
			weekDayName = "Thursday";
			break;
		case 5:
			weekDayName = "Friday";
			break;
		case 6:
			weekDayName = "Saturday";
			break;
		case 7:
			weekDayName = "Sunday";
			break;
		default:
			weekDayName ="Invalid";
		}
		return weekDayName;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
