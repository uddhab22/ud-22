package com.class11;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create an array on integers and 
		 * calculate the sum of all elements in an array.
			Create an array of countries. While retrieving all values from 
				an array print capital for each country. (use 2 different loops).
		 * 
		 */
		
		int sum = 0;
		
		int[] num = {1,2,3,4,5,6,7,8,9,9};
		for (int i=0; i<num.length; i++) {
			sum = sum + num[i];
		}
		
		System.out.println(sum);
		
		System.out.println("#####################################");
		
		System.out.println("Task 3");
		System.out.println();
		
		String[] country = {"Nepal","USA","India","Japan"};
		
		for (int a=0; a<country.length;a++) {
			
			if(country[a].equals("Nepal")) {
				System.out.println("The Capital of "+country[a]+" is Kathmandu.");
			}
			else if(country[a].equals("USA")) {
				System.out.println("The Capital of "+country[a]+" is Washington DC.");
			}
			else if(country[a].equals("India")) {
				System.out.println("The Capital of "+country[a]+" is Dehli.");
			}
			else if(country[a].equals("Japan")) {
				System.out.println("The Capital of "+country[a]+" is Tokyo.");
			}
			else{
				System.out.println("Unknown");
			}
			System.out.println();
		}	
		System.out.println("****************************");
		System.out.println("Task 3 with use of different loop");
		System.out.println();
		
		
		for(String x: country ) {
			
			if(x.equals("Nepal")) {
				System.out.println("Kathmandu.");
			}
			else if(x.equals("USA")) {
				System.out.println("Washington DC.");
			}
			else if(x.equals("India")) {
				System.out.println("Dehli.");
			}
			else if(x.equals("Japan")) {
				System.out.println("Tokyo.");
			}
			else{
				System.out.println("Unknown");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
