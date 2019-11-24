package JavaQI;

public class IQ1 {

	public static void main(String[] args) {
		/*
		 * Write a program to swap 2 numbers without a temporary variable?
		 * Swap 2 strings without a temporary variable?
		 */
		
		int a =20;
		int b= 10;
		
		a=a-b;
		b=a+b;
		
		
		System.out.println("The value of a = "+a);
		System.out.println("The value of b = "+b);
		System.out.println("========================");
		System.out.println();
		
		String str1 ="welcome";
		String str2= "hello";
		
		str1=str1+str2;
		str2= str1.substring(0,str1.length()-str2.length());
		str1= str1.substring(str2.length());
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		
		
		
	}

}
