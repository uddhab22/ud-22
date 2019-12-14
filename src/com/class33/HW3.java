package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW3 {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		
		li.add("Red Bull");
		li.add("Coke");
		li.add("Milk");
		li.add("Juice");
		li.add("tea");
		
		for(int i = 0; i<li.size();i++) {
			if(li.get(i).contains("a")||li.get(i).contains("e")) {
				li.set(i, "water");
			}
		}
	
		System.out.println(li);
		
		
		
		
		
	
	
	
	
	}

}
