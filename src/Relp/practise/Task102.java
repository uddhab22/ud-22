package Relp.practise;

import java.util.Scanner;

public class Task102 {

	public static void main(String[] args) {
		String[] arr = new String[5];
		for (int i=0;i<5;i++){
			Scanner input = new Scanner(System.in);
			
			arr[i] = input.nextLine();
			
		}
		//leave above alone!  write your code below
		for(int a=0;a<arr.length;a++){
		      System.out.println(arr[a].substring(0,3));
		    }
		

	}

}
