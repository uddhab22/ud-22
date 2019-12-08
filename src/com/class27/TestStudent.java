package com.class27;

public class TestStudent {

	public static void main(String[] args) {
		Student[] stdArray = {new SyntaxStudent(),new SchoolStudent(),new CollegeStudent()};
		
		for (Student std1:stdArray) {
			std1.attendence();
			std1.payment();
			System.out.println("========================");
			
		}
		
		
		CollegeStudent std2 = new CollegeStudent();
		std2.loan();
	}

}
