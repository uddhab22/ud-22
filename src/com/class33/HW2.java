package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Cute");
		list.add("Love");
		list.add("Hello");
		list.add("Java");
		
		Iterator<String> ite = list.iterator();
		
		while(ite.hasNext()) {
			if(ite.next().endsWith("e")) {
				ite.remove();
				
			}
		}
		System.out.println(list);
	}

}
