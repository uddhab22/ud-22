package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Hello");
		list.add("Bye");
		list.add("Hello");
		list.add("bye");
		list.add(2,"How are you?");
		System.out.println(list);
		list.set(1, "good bye?");
		System.out.println(list);
		
		System.out.println("==============");
	
	for(int i=0; i<list.size();i++) {
		System.out.println(list.get(i));	
	}System.out.println("==========");
	
	for(String str:list) {
		System.out.println(str);
	}
	System.out.println("===========");
	Iterator it = list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}

}
}
