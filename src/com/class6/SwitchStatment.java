package com.class6;

import java.util.Scanner;

public class SwitchStatment {

	public static void main(String[] args) {
		/*
		 * 7 days
		 * 1 = monday, 2= tuesday .....7 = sunday
		 */
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		String weekDay;
		
		switch(day) {
		
		case 1:
			weekDay = "Monday";
			break;
		case 2:
			weekDay = "Tuesday";
			break;
		case 3:
			weekDay = "Wednesday";
			break;
		case 4:
			weekDay = "Thursday";
			break;
		case 5:
			weekDay = "Friday";
			break;
		case 6:
			weekDay = "Saturday";
			break;
		case 7:
			weekDay = "Sunday";
			break;
		default:
			weekDay = "Invalid";
			
		}
		System.out.println(weekDay);
	}

}
