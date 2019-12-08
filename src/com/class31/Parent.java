package com.class31;

public class Parent {
	 static void hello() {
		System.out.println("Hello from super class");
	}
	

}
class child extends Parent{
	 static void hello() {
		System.out.println("Hello from sub class");
	}
}
