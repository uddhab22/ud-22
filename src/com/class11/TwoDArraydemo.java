package com.class11;

public class TwoDArraydemo {

	public static void main(String[] args) {
		
		String[][] names = {
				{"ab","cd","ef","gh","ij"},
				{"kl","mn","op","qr"},
				{"st","uv","vx","yz"}		
				
		}; 
		
		int numArray= names.length;
		System.out.println(numArray);
		System.out.println();
		
		
		int eleCloumn1=names[0].length;
		System.out.println(eleCloumn1);
		System.out.println();
		
		for(String getArrays[]:names) {
			for(String getEle:getArrays) {
				System.out.print(getEle+" ");
			}
			System.out.println();
		}
		
				
		
		
	}

}
