package com.class8;

public class ForLooptask {

	public static void main(String[] args) {
		for (int i=1; i<101; i++) {
			System.out.print(i+" ");
		}
		System.out.println(".");
		
		for (int i=100; i>0; i--) {
			System.out.print(i+" ");
		}
		System.out.println(".");
		
		for (int x=20; x>1;x-=2) {
			System.out.print(x+" ");
		}
		System.out.println(".");
		
		for (int i =20; i>1; i--){
			if (i%2==0) {
			System.out.print(i+" ");
			}
		}
		System.out.println(".");
		
		for (int i =21; i<51;i+=2){
			System.out.print(i+" ");
		}
		System.out.println(".");
		
		for (int i =21; i<51; i++){
			if (i%2!=0) {
			System.out.print(i+" ");
			}
		}
		System.out.println(".");
		System.out.println("---------------------");
		
		int sum =0;
		for (int i=1; i<=5; i++) {
			sum = sum +i;
			System.out.print(i+"+");
		}
		System.out.println();
		System.out.println(sum);
		
		System.out.println("---------------------");
		
		int sumAll =0;
		for (int i=0; i<=50; i+=5) {
			sumAll = sumAll +i;
			System.out.print(i+"+");
		}
		System.out.println();
		System.out.println(sumAll);
		System.out.println("#########################");
		
		int total=2;
		for (int y=1; y<4; y++) {
			total = total*y;
		}
		System.out.println();
		System.out.println(total);
		
		
		
			
			
			
			
			
			
		
		
		
		
		
		 
		

	}

}
