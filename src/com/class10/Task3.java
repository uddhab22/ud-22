package com.class10;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using element of array:
		 *  “Saturday is Java coding Day”. 
		 */
		
		String[] classes = new String[5];
		classes[0]="Java";
		classes[1]="Saturday";
		classes[2]="day";
		classes[3]="coding";
		classes[4]="is";
		
		
		System.out.println(classes[1]+" "+classes[4]+" "+classes[0]+" "+classes[3]+" "+classes[2]+".");
		
		
	}

}
