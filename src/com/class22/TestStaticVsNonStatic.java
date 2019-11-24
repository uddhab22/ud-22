package com.class22;

public class TestStaticVsNonStatic {

	public static void main(String[] args) {
		System.out.println(StaticVsNonStatic.school);
		StaticVsNonStatic.getInfo1();
		
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.name = "John";
		obj.grade='A';
		obj.getInfo();
		

	}

}
