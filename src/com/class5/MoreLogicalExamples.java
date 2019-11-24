package com.class5;
// to import shortcut is command+shift+o
import java.util.Scanner;

public class MoreLogicalExamples {

	public static void main(String[] args) {
		/*
		 * ask user to enter daily sales
		 * based on sales, give commission to the person
		 * if sales is <100 --> commisssion is 10%
		 * if sales is 100 to 200 --> commission 20%
		 * if sales 200 and more -- commision 30%
		 */
		
		Scanner input;
		double sale;
		double com;
		
		input = new Scanner(System.in);
		System.out.println("enter the sales amount");
		
		sale = input.nextDouble();
		
		
		if (sale >0 && sale<100) {
			// lets give user 10% commision
			com = sale * 0.1;
			
		}
		else if (sale>=100 && sale<=200) {
			// lets give user 20% commision
			com = sale * 0.2;
			
		}
		else if (sale>200) {
			// lets give user 30% commision
			com = sale * 0.3;
			
		}
		else {
			com = 0;

		}
		System.out.println("Your Commission is "+com);
		
		
		
		
		
	}

}
