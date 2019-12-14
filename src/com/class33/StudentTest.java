package com.class33;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class Student{
	
	String name;
	int studentID;
	
	public Student(String name , int studentID) {
		this.name = name;
		this.studentID=studentID;
	}
	
	public void display() {
		System.out.println("My name is "+name+" and my student ID number is "+studentID);
	}
}

public class StudentTest {
	
	public static void main(String[] args) {
		Student s1 = new Student("John", 2056);
		Student s2 = new Student("James", 2057);
		Student s3 = new Student("Jore", 2058);
		List<Student> students = new ArrayList<>();
	
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(new Student("Paul", 2059));
		
		s1.display();
		s2.display();
		s3.display();
		
		System.out.println("========= using loop =========");
		
		for(Student stu:students) {
			stu.display();
			
		}
		System.out.println("========= using Iterator =========");
		
		
		Iterator<Student> myITR = students.iterator();
		while(myITR.hasNext()) {
			myITR.next().display();
		}
	}
}
