package com.class18;

public class hello {
	
	
	void sayHello(String name) {
		System.out.println("Hello "+name);
		System.out.println();
	}

	public static void main(String[] args) {
		
		hello obj = new hello();
		obj.sayHello("Asel");
		obj.sayHello("Weqas");
		obj.sayHelloDiffrentLanguage("USA");	
		obj.sayHelloDiffrentLanguage("Russia");
		obj.sayNameAndAge("Joy", 25);
		obj.sayNameAndAge("John", 45);
		obj.isSnowing(false);
		obj.isSnowing(true);
	}
	/*
	 * create a method that say hello in different language based on the 
	 * value that is passed on
	 */
	void sayHelloDiffrentLanguage(String country) {
		
		switch (country.toLowerCase()) {
		case "usa":
			System.out.println("Hello");
			break;
		case "russia":
			System.out.println("Privet");
			break;
		case "spain":
			System.out.println("hola");
			break;
		default:
			System.out.println("Invalid");
			
		
		}
	}
	// method to say name and age
	void sayNameAndAge(String name, int age) {
		System.out.println("My name is "+name+" and I am "+age+" years old");
		System.out.println();
	}
	// create a method that will check if it snowing
	void isSnowing(boolean isSnowing) {
		
		if (isSnowing) {
			System.out.println("Stay Home");
		}
		else {
			System.out.println("Go to the park");
		}
	}

}
