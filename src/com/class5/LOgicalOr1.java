package com.class5;



public class LOgicalOr1 {

	public static void main(String[] args) {
		/*7 days a week
		 * if day is 2 or 4 --> SDLC
		 * if day 6 or 7 --> Java coding
		 * day 1 or 5 --> no class
		 * if day is 3 -- Review class
		 */
		String str="sun";
		
		if (str.equals("tue") || str.equals("thu")) {
			System.out.println("We have SDLC class");
		}
		else if (str.equals("sat") || str.equals("sun")) {
			System.out.println("We have JAVA class");
		}
		else if (str.equals("mon") || str.equals("fri")) {
			System.out.println("We have NO class");
		}
		else if (str.equals("wed")) {
			System.out.println("We have Review class");
		}
		else {
			System.out.println("not a valid input");
		}
		
	}

}
