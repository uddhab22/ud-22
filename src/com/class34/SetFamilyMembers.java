package com.class34;

import java.util.*;

public class SetFamilyMembers {

	public static void main(String[] args) {
		
		//LinkedHashSet doesn't allows duplicate and preserve the inserted oder
		Set<String> fruitset = new LinkedHashSet<>();
		fruitset.add("Apple");
		fruitset.add("Banana");
		fruitset.add("Kiwi");
		fruitset.add("Grape");
		fruitset.add("pineapple");
		fruitset.add("Banana");
		System.out.println("===== LinkedHashSet ===================");
		System.out.println(fruitset.size());
		System.out.println(fruitset);
		
		
		
		
		System.out.println("======= TreeSet ========================");
		
		// TreeSet doesn't allows duplicate and sorts objects in acending order
		Set<Integer> tset = new TreeSet<>();
		tset.add(200);
		tset.add(2000);
		tset.add(2010);
		tset.add(20);
		tset.add(200);
		tset.add(2001);
		
		System.out.println(tset.size());
		System.out.println(tset);
		
		System.out.println("==========================");
		
		List<String>list= new ArrayList<>();
		list.add("Java");
		list.add("Selenium");
		list.add("TestNG");
		
		Set<String> lSet = new TreeSet<>();
		lSet.addAll(fruitset);
		lSet.addAll(list);
		System.out.println(lSet);
		System.out.println(lSet.size());
		
		
	}

}
