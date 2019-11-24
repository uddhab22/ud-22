package com.class18;

public class buitanduserdefinedmethod {

	public static void main(String[] args) {
		// inbuilt method - limited, cannot modify
		String str = "Hello";
		str = str.replace("Hello", "Hi");
		System.out.println(str);
		
		buitanduserdefinedmethod obj = new buitanduserdefinedmethod();
		obj.myMethod();
		
	}
	// user defined method - unlimited and can be modified
	void myMethod() {// method header
		System.out.println("THis is method I created"); // method body
	}
	

}
