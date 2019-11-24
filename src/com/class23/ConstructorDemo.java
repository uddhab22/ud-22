package com.class23;

public class ConstructorDemo {
	
	 ConstructorDemo() {
		System.out.println("I am a constructor without parameters");
	 }
	 ConstructorDemo(String str){
		 System.out.println("I am a constructor with 1 paramater "+str);
	 }
	 ConstructorDemo(int num){
		 System.out.println("I am a constructor with 1 paramater "+num);
	 }
	 ConstructorDemo(int x, int y){
		 int z =x+y;
		 System.out.println(x+" + "+y+" = "+z);
	 }
	
	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo();
		System.out.println("Code after creating an Object");
		obj.hello();
		ConstructorDemo obj1 =new ConstructorDemo(123);
		ConstructorDemo obj2 =new ConstructorDemo("one paramenter");
		ConstructorDemo obj3 =new ConstructorDemo(3,3);
	}
	public void hello() {
		System.out.println("hello ");
	}
}
