package com.class8;

public class TaskBreakandC0ntinue {

	public static void main(String[] args) {
		// print 1 to 2 expect 5,6,7
		
		for (int a=1; a<21; a++) {
			if(a==5 || a==6 || a==7) {
				continue;
			}
			System.out.print(a+" ");
		}

	}

}
