package com.class32;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList<String>arraylist= new ArrayList<>();
		
		// to store the value inside your collection 
		
		arraylist.add("John");
		arraylist.add("Jane");
		arraylist.add("Jack");
		
		System.out.println(arraylist.get(0));
		arraylist.add("james");
		arraylist.add("john");
		arraylist.add("jane");
		
		System.out.println(arraylist.get(4));
		
		
		// how many elements inside the arraylist
		
		int size = arraylist.size();
		System.out.println(size);
		System.out.println(arraylist);
		
		//creating object of arraylist that hold numberic value
		ArrayList<Integer> numArraylist = new ArrayList<>();
		numArraylist.add(100);
		numArraylist.add(200);
		numArraylist.add(300);
		System.out.println(numArraylist);
		
		System.out.println(numArraylist.get(2));
		System.out.println(numArraylist.size());
		
		
		
		
		for (int i=0;i<numArraylist.size(); i++) {
			System.out.print(numArraylist.get(i)+" ");
		}
		System.out.println();
		
		for(Integer i:numArraylist) {
			System.out.print(i
					+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
