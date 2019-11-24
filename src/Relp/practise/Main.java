package Relp.practise;

public class Main {
	
	
		 public static char getChar(String word, int index){
		   char character =word.charAt(index);
		   return character;
		 }
		 public static void main(String[] args){
		   System.out.println(getChar("abcdef",1));
		 }
		} 
