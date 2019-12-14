package Relp.practise;

public class hw174 extends Parent1{
	/*
	 * Create abstract class as  parent 
Create default constructor in the abstract class 
put the logic to print "abstract class Constructor"
Extends the abstract class with main class
Declare default constructor in the main class
put the logic to print  "Main class Constructor"

In main method create the object  for the main class 

	 */
	 hw174() {
		System.out.println("Main class Constructor");
	}

	public static void main(String[] args) {
		hw174 mm = new hw174();
	}
}
abstract class Parent1{
	Parent1(){
		System.out.println("abstract class Constructor");
	}
}
