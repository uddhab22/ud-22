package Relp.practise;

public interface MyInterface {
	/*
	 * Create Interface as MyInterface 
	Declare variables as following:
	int a=100;
	final int b=200;
	static int c=300;
	Inherit Main Class to MyInterface. 
	in main method. print all the variables you declared in myInterface
	 */
	
	int a = 100;
	final int b =200;
	static int c =300;

}
class hello implements MyInterface{
	public static void main(String[] args) {
		System.out.println(b);
	}
}
