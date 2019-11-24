package com.class2;

public class ArithmeticOperation {
	/*
	 * declare 2 variables & initialize them 
	 * display result of addition, subtraction, multiplication and division
	 */
	
	public static void main(String[] args) {
		
		int num1,num2;
		
		num1 = 20;
		num2 = 10;
		
		System.out.println(num1+num2);  // should be 60
		System.out.println(num1-num2);  // 20
		System.out.println(num1*num2);	// 800
		System.out.println((num1/num2));	//2
		
		
		int sum = num1+num2;
		int sub = num1-num2;
		int multiplication = num1*num2;
		int div = num1/num2;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(multiplication);
		System.out.println(div);
	}

	
	
}
