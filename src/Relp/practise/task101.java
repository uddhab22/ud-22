package Relp.practise;

public class task101 {

	public static void main(String[] args) {
	    String s1="hello how are you"; 
	    
	    /*
	     * Step 1: Replace the  "h" with "t".
			Step 2: Replace "you" with "hi".
			Step 3: Replace  "hello how are you"  with  "i am fine".
	     * 
	     */
	    
	    System.out.println(s1.replace('h', 't'));
	    System.out.println(s1.replaceFirst("you", "hi"));
	    System.out.println(s1.replaceAll("hello how are you", "i am fine"));
	    
	    
	    
	  }
}
