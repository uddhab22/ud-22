package com.class33;

import java.util.ArrayList;
import java.util.List;

public class InstructorList {
	public static void main(String[] args) {
		List<Instructor> ins = new ArrayList<>();
		ins.add(new Instructor("Asel", "Asel"));
		ins.add(new Instructor("Sumair", "Sumair"));
		
		for(Instructor in:ins) {
			System.out.println(in.lastName);
			in.display();
		}
		
		
	}

}
