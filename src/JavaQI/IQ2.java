package JavaQI;

import java.util.Arrays;

public class IQ2 {

	public static void main(String[] args) {
		/*
		 * Write a java program to find the second largest number in the array? 
		 * Maximum and minimum number in the array?
		 */
		
		
		int[] num = {1,2,3,4,5,6};
		Arrays.sort(num);
		
		int min = num[0];
		int max = num[num.length -1];
		
			
		System.out.println("max = "+max);
		System.out.println("min = "+min);
		
		System.out.println("=========== 2nd and better way of doing ==================");
		//2nd way 
		
		int [] array = {100,200,-40,60,75};
		int largest = array[0];
		int smallest = array[0];
		for ( int i=0; i<array.length; i++) {
			if (array[i]>largest) {
				largest = array[i];
			}
			if (array[i]<smallest) {
				smallest = array[i];
			}
		}
		System.out.println("largest = "+largest);
		System.out.println("smallest = "+smallest);
		System.out.println();
		System.out.println("=========== 2nd largest number ==============");
		
		int [] num1 = {100,200,300,20,-40,999,345,1111};
		
		int large =num[0];
		int seclarge = num[0];
		
		for (int i =0; i<num1.length; i++) {
			if(num1[i]>large) {
				seclarge = large;
				large = num1[i];	
			}
		}
		System.out.println("The second largest value of this array is "+seclarge);
		System.out.println(large);
		
		
		
		
		
		
		}		
	}


