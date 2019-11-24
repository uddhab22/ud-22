package com.class8;

public class TAsk3 {

	public static void main(String[] args) {
		// print 1 to 50 except those divisible by 3
		
		for(int x=1; x<51; x++) {
			if (x%3==0) {
				continue;
			}
			System.out.print(x+" ");
		}
		


	}

}
