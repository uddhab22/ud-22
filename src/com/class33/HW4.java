package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW4 {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		
		for(int i=2;i<51; i+=2) {
			num.add(i);
		}
		System.out.println(num);
		
		
		Iterator<Integer> it = num.iterator();
		
		while(it.hasNext()) {
			if(it.next()%5 ==0) {
				it.remove();
				
			}
		}
		System.out.println(num);
		
	}

}
