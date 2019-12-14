package com.class34;

import java.util.*;

public class IteratorUsage {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Uddhab");
		list.add("AK");
		list.add("US");
		list.add("Herman");
		list.add("Raj");
		
		
		//list.remove("AA");
		System.out.println(list);
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).length()<3) {
				list.remove(i);
			}
		}
		System.out.println(list);
		
		// best way to remove from a collection is Iterator
		
		List<String> list1 = new ArrayList<>();
		list1.add("Uddhab");
		list1.add("AK");
		list1.add("US");
		list1.add("Herman");
		list1.add("Raj");
		System.out.println("==================");
		System.out.println(list1);
		
		Iterator<String> it = list1.iterator();
		while(it.hasNext()) {
			if(it.next().length() <3) {
				it.remove();
				
			}
		}
		System.out.println(list1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
