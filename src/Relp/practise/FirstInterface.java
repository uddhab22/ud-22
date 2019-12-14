package Relp.practise;

public interface FirstInterface{
	  void firstMethod();
}
interface SecondInterface{
	  void secondMethod();
}
class maintain implements FirstInterface, SecondInterface {
		  
		  public void firstMethod(){
		    System.out.println("First Method implementing multiple Inheritance");
		  }
		  public void secondMethod(){
		    System.out.println("Second Method implementing multiple Inheritance");
		  }
		  public static void main(String[] args){
		    maintain mm = new maintain();
		    mm.firstMethod();
		    mm.secondMethod();
		  }
		}