package com.class28;
/*
 * Write program: userClass  
 * that has a constructor that initializes name and 
 * mobile number istance variables. 
 * Create a subclass  userInfo that will 
 * have user address variable and it also being initialized 
 * through constructor call. Print users name, mobile number 
 * and address in userDetails method. 
 * Test your code.
 */
public class userClass {
	String name;
	int mobileNum;
	
	userClass(String name, int mobileNum){
		this.name = name;
		this.mobileNum=mobileNum;
	}

}
