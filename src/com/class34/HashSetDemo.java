package com.class34;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// lets create a collectin of vegies where i do not want to have duplicates
		
		HashSet<String> hset = new HashSet<>();
		hset.add("cucmber");
		hset.add("olives");
		hset.add("onion");
		hset.add("blackpeper");
		hset.add("carrot");
		hset.add("cucmber");
		
		System.out.println(hset.size());
		System.out.println(hset);
		System.out.println("==============");
		
		//how to reteive all elements
		
		Iterator<String> it = hset.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
		System.out.println("=============");
		for(String ele:hset) {
			System.out.println(ele);
		}
		
	}

}
