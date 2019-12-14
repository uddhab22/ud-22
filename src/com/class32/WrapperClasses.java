package com.class32;

public class WrapperClasses {

	public static void main(String[] args) {
		
		System.out.println("============== AutoBoxing ===============");
		
		int num = 10;
		// Autoboxing --> converting primitive data type to object type
		
		Integer n1 =100;
		System.out.println(n1.MIN_VALUE);
		
		String str = n1.toString();
		System.out.println(str);
		 Boolean b1 = true; // converting boolean primitive type to Boolean object type
		 
		Byte b = 20;
		System.out.println(b.MIN_VALUE);
		System.out.println(b.MAX_VALUE);
		
		
		//AutoUnBoxing --> converting Object type to primitive type
		System.out.println("============== AutoUnBoxing ===============");
		
		
		int num1 = new Integer(10);
		
		System.out.println(num1);
		
		
		
		
		
		
	}

}
