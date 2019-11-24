package com.class19;

public class Task1 {
	/*
	 * Create a method createEmail(). Based on provided 
	 * users name, lastName and email type, 
	 * your method should return complete email Address. 
	 * Example: johnsnow@gmail.com or johnsnow@yahoo.com*
	 * 
	 */
	
	
	String createEmail(String name,String lastName, String emailType) {
		String email = name+lastName+emailType;
		return email;
		
	}
	
	
	
	
	public static void main(String[] args) {
		Task1 obj = new Task1();
		String email = obj.createEmail("uddhab", "rijal", "@gmail.com");
		System.out.println(email);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
