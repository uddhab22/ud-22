package com.class34;

import java.util.*;


class Sweets{
	String name;
	
	Sweets(String name){
		this.name = name;
	}
	public void iLove() {
		System.out.println("I love "+name);
	}
}
public class LinkedListDemo2 {
	public static void main(String[] args) {
		List<Sweets> slist = new LinkedList<>();
		slist.add(new Sweets("Chocolate"));
		slist.add(new Sweets("Cake"));
		
		
		for(Sweets sweet:slist) {
			System.out.println(sweet.name);
			sweet.iLove();
		}
		
	}

}
