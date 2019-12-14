package com.class33;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// create linked list of String obj
		
		LinkedList<String> link = new LinkedList<>();
		link.add("Hello ");
		link.add("Bye");
		
		System.out.println(link.size());
		
		System.out.println(link.get(1));
		
		link.set(1, "Hola");
		System.out.println(link);
		
		

	}

}
