package com.class9;

public class Pattern {

	public static void main(String[] args) {
		
		for (int k = 1; k<=5; k++) {
			for (int l = 1; l<=5; l++) {
				System.out.print("* ");
			}
		}
		System.out.println();
		/*
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 */
		
		for(int x=1; x<5; x++) {
			for (int y=1; y<6; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		for(int x=1; x<5; x++) {
			for (int y=1; y<6; y++) {
				System.out.print(x);
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		/*
		 * 123456789
		 * 123456789
		 * 123456789
		 * 123456789
		 * 123456789
		 */
		for(int x=1; x<6; x++) {
			for (int y=1; y<10; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		/*
		 *54321
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 */
		for (int x=1; x<6; x++) {
			for (int y=5; y>0; y--) {
				System.out.print(y);
			}
			System.out.println();
		}
		
		System.out.println("---------------------");
		
		
		/*
		 * 55555
		 * 44444
		 * 33333
		 * 22222
		 * 11111
		 */
		
		for (int x=5;x>0;x--) {
			for (int y=1;y<6;y++) {
				System.out.print(x);
			}
			System.out.println();
		}
		
		System.out.println("---------------------");
		
		/*
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 */
		
		for (int x=1; x<6; x++) {
			for (int y=1; y<=x; y++ ) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
