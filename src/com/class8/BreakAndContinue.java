package com.class8;

public class BreakAndContinue {

	public static void main(String[] args) {
		// break; keyword breaks/exit the loop
		for (int i=0; i<10; i++) {
			if(i==7) {
				break;
			}
			System.out.println(i);
			
			
		}
		System.out.println("i am outside of loop");
		System.out.println();
		
		
		// continue; keyword skip current iteration
		
		for (int i=1; i<11; i++) {
			if(i==3 || i==5 || i==7 ) {
				continue;
			}
			
			System.out.println(i);
		}
		System.out.println("i am outside of loop");
		
	}

}
