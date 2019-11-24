package com.class10;

public class TAsk2 {

	public static void main(String[] args) {
		/*
		 * Create an array of names and store all names of your group. 
		 * Then print your name from that array. 
		 * (use 2 different ways of creating an array).
		 */
		
		
		
		
		String[] name;
		name= new String[6];
		name[0]="Uddhab";
		name[1]="Dennis";
		name[2]="Marcelo";
		name[3]="Herman";
		name[4]="Jai";
		name[5]="Jay Pala";
		
		
		System.out.println(name[0]);
		System.out.println("----------------------");

		System.out.println("2nd way of doing");
		System.out.println();
		
		String[] group= {"Jay","Dennis","Marcelo","Jai","Dennis","Uddhab"};
		
		System.out.println(group[5]);
		System.out.println();
		System.out.println("-----------------------");
		for (int x=0;x<name.length; x++) {
			System.out.print(name[x]+" ");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
