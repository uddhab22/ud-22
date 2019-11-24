package com.class13;

public class task3 {

	public static void main(String[] args) {
		
		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS).
		 * 
		 * 
			Create a String and if the String is not empty perform the following: 
			if the String has an odd number of characters and has 3 or more characters, 
			print the character in the middle of the String.
		 * 
		 */
		
		
		String str = "Saturday";
		
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		String str1 ="123456789";
		int m = (str1.length()/2);
	
		
		if (!str1.isEmpty()) {
			if (str1.length() %2!=0) {
				System.out.println(str1.charAt(m));
				
			}
			else {
				System.err.println("string is not even");
				
			
		}
		}
		
		System.out.println();
		System.out.println("================================");
		
		System.out.println(str.replace("Saturday", "Sunday"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
