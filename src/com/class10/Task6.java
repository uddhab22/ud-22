package com.class10;

public class Task6 {

	public static void main(String[] args) {
		//  Create an array of countries. 
		//While retrieving all values from 
		//an array print capital for each country.	
		
		String[] country = new String[4];
		country[0]= "Nepal";
		country[1]= "USA";
		country[2]= "India";
		country[3]= "Japan";
		
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
		
		System.out.println();	
	}

}
