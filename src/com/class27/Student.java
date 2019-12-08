package com.class27;

public class Student {
	public void attendence() {
		System.out.println("80% of attandence is required by college student to give final Exam.");
	}
	public void payment() {
		System.out.println("Can apply for grant for payment.");
	}
}
class SyntaxStudent extends Student{
	public void attendence() {
		System.out.println("100% attendence is recomended for Syntax Student.");
	}
	public void payment() {
		System.out.println("Grant is not accepcted.");
	}
	
}
class CollegeStudent extends Student{
	public void loan() {
		System.out.println("Federal Loan can be applied for the college tution payment.");
	}
}

class SchoolStudent extends Student{
	public void attendence() {
		System.out.println("70% of attendence is required for School student to pass the  year.");
	}
}