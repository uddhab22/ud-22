package com.class19;

public class Student {
	
	char score(int num) {
		char grade;
		if(num>90 & num <101) {
			grade = 'A';
		}
		else if(num>80 & num <=90) {
			grade = 'B';
		}
		else if(num>70 & num <=80) {
			grade = 'C';
		}
		else if(num>50 & num <=70) {
			grade = 'D';
		}
		else {
			grade ='F';
		}
		return grade;
	}

	public static void main(String[] args) {
		/*
		 * Create  class Student that will have a method getGrade. 
		 * Your method should accept the score of a student and return a grade:
		 * score > 90 - A
			score >80 - B
			score >70 - C
			score > 50 - D
			anything else - F
		 */
		Student obj = new Student();
		char grade =obj.score(81);
		System.out.println(grade);
			
	}

}
