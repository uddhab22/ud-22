package com.class27;

public class ExamplesTest {

	public static void main(String[] args) {
		Examples ex = new smallExample();
		String str =ex.helloName("John");
		String str1 = ex.helloName("James ", "Smith");
		System.out.println(str);
		System.out.println();
		System.out.println(str1);
		
	}

}
