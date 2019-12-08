package com.class27;

public final class FinalKeyword {
	public final static  String Str = "Hello";
	
	public static void main(String[] args) {
		//Str =" I am awesome";
		//Str = "I am cool";
		System.out.println(Str);
		System.out.println("============================");
		
		final String finalStr = "Java is easy";
		//finalStr = "Java is hard";
		final int i = 100;
		//i = 120;
		
		System.out.println(i+", "+finalStr);
		FinalKeyword f1 = new FinalKeyword();
		f1.hello();
		f1.hello(1);
		
		
		
	}
	public final void hello() {
		System.out.println(" I am final method in parent class");
	}
	public final void hello(int x) {
		System.out.println("I am final method with 1 parameters");
	}

}
//class FinalKeywordChild extends FinalKeyword{ final class prevent it to extends to any other class. It made it finall class.
	//public final void hello() {
		
	//}
	

