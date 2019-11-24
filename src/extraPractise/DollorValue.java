package extraPractise;

import java.util.Scanner;

public class DollorValue {

	public static void main(String[] args) {
		int quarters;   
	      int dimes;     
	      int nickels;   
	      int pennies;   
	      
	      Scanner scan = new Scanner( System.in );
	      
	      double dollars; 
	      System.out.print("Enter the number of quarters:  ");
	      quarters = scan.nextInt();
	      
	      System.out.print("Enter the number of dimes:     ");
	      dimes = scan.nextInt();
	      
	      System.out.print("Enter the number of nickels:   ");
	      nickels = scan.nextInt();
	      
	      System.out.print("Enter the number of pennies:   ");
	      pennies = scan.nextInt();
	      
	      
	      dollars = (0.25 * quarters) + (0.10 * dimes) 
	                          + (0.05 * nickels) + (0.01 * pennies); 
	      
	      
	      System.out.println();
	      System.out.print("The total in dollars is $"+dollars);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
