package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * ask user to enter boolean value for sale ,
		 * if no sale--> i am not shopping
		 * if sale --> check the price of the item
		 * based on the amount we will calculate the price after discount
		 * price<20 --- dis =10%
		 * price between 20-100 --> 20%
		 * 100-500 --> 30%
		 * 500 and more --> 50%
		 * After discount ___ the price of the item reduces from ___ to ___
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Is the item on sale, true or false");
		boolean sale=scan.nextBoolean();
		double price=0.00;
		double dis=0.00;
		double finalPrice;
		
		if (sale) {
			System.out.println("Enter the price of the item");
			price=scan.nextDouble();
			if (price<20) {
				dis = price*0.1;
				finalPrice= price-dis;
			}
			else if (price>=20 && price<100) {
				dis = price*0.2;
				finalPrice= price-dis;
			}
			else if (price>=100 && price<500) {
				dis = price*0.3;
				finalPrice= price-dis;
			}
			else if (price>=500) {
				dis = price*0.5;
				finalPrice= price-dis;
			}
			else {
				dis = 0.0;
				finalPrice= price-dis;
			}
			System.out.println("After discount of $"+dis+" the price of the item is reduced form $"+price+" to $"+finalPrice);
			
		}
		else {
			System.out.println("I am not Shopping");
		}
				
	}

}
