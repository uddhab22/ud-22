package com.class11;

public class TwoDArray {

	public static void main(String[] args) {
		// 2D Array
		
		int[][] array= new int[3][4];
		// 1st row
		array[0][0]=44;
		array[0][1]=80;
		array[0][2]=33;
		array[0][3]=20;
		
		
		//2nd row
		array[1][0]=10;
		array[1][1]=5;
		array[1][2]=7;
		array[1][3]=8;
		
		//3rd row
		array[2][0]=10;
		array[2][1]=9;
		array[2][2]=70;
		array[2][3]=80;

		System.out.println(array[1][3]);
		System.out.println("-----------------------------------------");
		System.out.println();
		
// simple task
		// create an 2d array of string with 2 rows and 3 columns 
		
		String[][] name= new String[2][3];
		
		//1st row
		name[0][0]="name1";
		name[0][1]="name2";
		name[0][2]="name3";
		
		//2nd row
		name[1][0]="name4";
		name[1][1]="name5";
		name[1][2]="name6";
		
		
		System.out.println(name[0][2]);
		System.out.println("-----------------------------------------");
		System.out.println();
		
		
		int [][] num = {
				{5,4,3,2,1},
				{1,2,3,4,5},
				{6,7,8,9,10}
				};
		
		
		System.out.println(num[2][3]);
		System.out.println("-----------------------------------------");
		System.out.println();
		
		//to get length of row
		System.out.println("Number of row");
		System.out.println(num.length);
		System.out.println("-----------------------------------------");
		System.out.println();
		
		
		//to get column or elements in particular row
		System.out.println("Number of element in row");
		System.out.println(num[1].length);
		System.out.println("-----------------------------------------");
		System.out.println();
		
		
		for(int i=0; i<num.length; i++) {
			for (int j=0; j<num[i].length;j++) {
				System.out.print(num[i][j] +" ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}