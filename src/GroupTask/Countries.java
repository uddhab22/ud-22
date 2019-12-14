package GroupTask;

import java.util.*;

public class Countries {
	public static void main(String[] args) {
		TreeSet<String> list = new TreeSet<>();
		list.add("Nepal");
		list.add("India");
		list.add("China");
		list.add("USA");
		System.out.println("1st method to");
		for(String country:list) {
			System.out.println(country);
		}
		System.out.println();
		System.out.println("2nd method to");
		
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
	
	

}