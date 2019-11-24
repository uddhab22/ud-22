package com.class10;

public class Task5 {

	public static void main(String[] args) {
		String[] animals= {"Cat","Dog","cow","Snake","Elephant"};
		//i want to print all values from the array
		// when value is dog --> I love dogs
		
		
		for(int a=0; a<animals.length;a++) {
			
			if(animals[a].equals("Dog")) {
				System.out.println("I love Dog");
			}
			
			else if(animals[a].equals("Snake")) {
				System.out.println("Snakes are dangerous.");
			}
			
			else if(animals[a].equals("Elephant")) {
				System.out.println("Elephant are huge`.");
			}
			
			else {
				System.out.println(animals[a]);		
			}
			
			System.out.println();
		}
		
		
		
	}
}
