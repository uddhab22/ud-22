package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
		ArrayList <Integer> num = new ArrayList<>();
		
		num.add(1);
		num.add(10);
		num.add(100);
		num.add(1000);
		num.add(10000);
		
		int size = num.size();
		System.out.println(size);
		// add more
		
		num.add(100000);
		System.out.println(num);
		
		// removing with the use of index number.
		
		num.remove(1);
		System.out.println(num);
		System.out.println(num.size());
		
		System.out.println(num.get(4));
		// for loop to print all
		for(int i =0; i<num.size();i++) {
			System.out.println(num.get(i));
		}
		// advance loop to print all
		for(int n1:num) {
			System.out.println(n1);
		}
		System.out.println("========= printing reverse ============");
		for (int i =num.size()-1; i>=0; i--) {
			System.out.println(num.get(i));
		}
	
		System.out.println("============ Iterator method ===========");
		// using Iterator
		
		Iterator<Integer> iterator = num.iterator(); 
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
	}
}
