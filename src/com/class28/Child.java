package com.class28;

public class Child extends Parent{
	
		String name = "James";
		public static void main(String[] args) {
			Child obj = new Child();
			obj.callName();
			System.out.println();
			obj.callingmethod();
			
			
		}
		public void callName() {
			System.out.println(name);
			System.out.println(super.name);
			System.out.println(lastName);
		}
		public void callingmethod() {
			callName();
			System.out.println();
			super.callName();
		}
		
	}



