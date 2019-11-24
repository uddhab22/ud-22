package com.class4;

public class NestedifPractice {

	public static void main(String[] args) {
		boolean isFriday=true;
		int day=14;
		
		if (isFriday) {
			System.out.println("Today is Friday.");
			if (day==13) {
				System.out.println("the 13th, I will go and watch scary movie.");
			}else {
				System.out.println("the " +day+", I will comedy movie.");
			}
		}
		else {
			System.out.println("Today is not Friday.");
		}
	}

}
