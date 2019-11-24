package com.class3;

public class IfConditions {

	public static void main(String[] args) {
		 int a=90;
		  int b=300;
		  
		  if (a>b) {
			  System.out.println("a is larger than b.");
		  }
		  else {
			  System.out.println("a is smaller than b.");
		  }
		
		  int expHour= 15;
		  int actualHour =20;
		  
		  if(expHour<actualHour) {
			  System.out.println("You will Succes.");
		  }
		  else {
			  System.out.println("please study more!!!");
		  }
			  
		  double teaPrice = 2.99;
		  double moneyInhand = 2.99;
		  
		  if (teaPrice<=moneyInhand) {
			  System.out.println("Give me a cup of tea.");
			  System.out.println("I will enjoy it.");
		  }
		  else {
			  System.out.println("I don't want it.");
			  System.out.println("I will go to different store.");
		  }
		  System.out.println("I will keep coding.");
	}

}
