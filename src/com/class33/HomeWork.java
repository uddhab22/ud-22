package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork {

	public static void main(String[] args) {
		ArrayList<String> carlist = new ArrayList<>();
		carlist.add("Ford");
		carlist.add("GMC");
		carlist.add("BMW");
		carlist.removeAll(carlist);
		System.out.println(carlist);
		System.out.println("========== First Way ==========");
		
		for(int i=0; i<carlist.size();i++) {
			System.out.println(carlist.get(i));
		}
		System.out.println("========== Second Way ==========");
		
		System.out.println();
		for (String car:carlist) {
			System.out.println(car);
			
		}
		System.out.println();	
		Iterator<String> ite = carlist.iterator();
		System.out.println("========== Third Way ==========");
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		
	}

}
