package com.class32;

import java.util.ArrayList;
//Generic ArrayList
public class Generic {
	public static void main(String[] args) {
		ArrayList<String> genericArrayList = new ArrayList<>();
		genericArrayList.add("Arlington");
		genericArrayList.add("Alexandria");
		genericArrayList.add("Fairfax");
		genericArrayList.add("Manasas");
		genericArrayList.add("Gainsville");
		
		
		
		System.out.println("Checking whether is ArrayList is empty ?");
		System.out.println(genericArrayList.isEmpty());
		
		System.out.println("Checking the size of ArrayList");
		System.out.println(genericArrayList.size());
		
		System.out.println("Printing all values of  ArrayList");
		System.out.println(genericArrayList);
		
		System.out.println("Checking whether is ArrayList contains Arlington in is ?");
		System.out.println(genericArrayList.contains("Arlington"));
		
		
		ArrayList<Object> alist = new ArrayList<>();
		alist.add("Hello");
		alist.add(123);
		alist.add(1.1);
		System.out.println("========== Non Generic ===============");
		System.out.println(alist);
		System.out.println(alist.size());
		System.out.println(alist.contains(123));
		
		
		
		
		
	}

}
