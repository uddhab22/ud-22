package com.class32;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> str1 = new ArrayList<>();
		str1.add("Arlington");
		str1.add("Alexandria");
		str1.add("Fairfax");
		str1.add("Manasas");
		str1.add("Gainsville");
		
		for(int i =0; i<str1.size();i++) {
			System.out.println(str1.get(i));
		}
		
		System.out.println("==============");
		
		for(String num:str1) {
			System.err.println(num);
		}
		
		 //Iterator it=(Iterator) str1.iterator();
		
		// System.out.println(it);
		
	}

}
