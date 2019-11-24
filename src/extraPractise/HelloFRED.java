package extraPractise;

import java.util.Scanner;

public class HelloFRED {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Hello, waht is your name ?");
		String name = input.nextLine();
		String upperCase;
		upperCase = name.toUpperCase();
		
		System.out.println("Hello "+upperCase+" good afternoon!");
		
	}

}
