package com.class35;

import java.util.*;

public class Recap {

	public static void main(String[] args) {
		Set<Double> set = new LinkedHashSet<>();
		set.add(10.00);
		set.add(9.00);
		set.add(88.99);
		set.add(10.67);
		
		Iterator<Double> ite = set.iterator();
		while(ite.hasNext()) {
			//double d =ite.next();
			if(ite.next()<88) {
				ite.remove();
			}
			
			
		}
		System.out.println(set);
		System.out.println("===============");

		for(Double d1:set) {
			System.out.println(d1);
		}	
		
	}

}
