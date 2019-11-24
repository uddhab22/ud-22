package com.class4;

public class PracticeifNestin {

	public static void main(String[] args) {
		/*
		 * We need to check if student completed the quiz
		 * if yes--> good job, if not --> not good
		 * if more than 90--> you got A
		 * if more than 80 --> you got B
		 * anything below--> you should study more
		 * 
		 */
		
		boolean quiz= true;
		double score = 80.00;
		
		if (quiz) {
			System.out.println("Good Job :-).");
			if (score>=90) {
				System.out.println("You got A.");
			}
			else if (score>=80) {
				System.out.println("You got B");
			}
			else {
				System.out.println("You should study more.");
			}
		}
		else {
			System.out.println("Not Good!!!");
		}
		
	}

}
