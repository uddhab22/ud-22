package com.class34;

import java.util.*;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		// create a collection that will store Sweets type of objects and don't care about the order and no duplicate
		
		Set<Sweets> sweetset=new HashSet<>();
		
		//sweetset.add(sweet);
		sweetset.add(new Sweets("Cookies"));
		sweetset.add(new Sweets("Ice Cream"));
		sweetset.add(new Sweets("Chocolate"));
		sweetset.add(new Sweets("Cookies"));
		
		System.out.println(sweetset.size());
		
		for(Sweets ste:sweetset) {
			System.out.println(ste.name);
		}
		System.out.println("==================");
		Iterator<Sweets> it = sweetset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
