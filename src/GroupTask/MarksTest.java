package GroupTask;

public class MarksTest {

	public static void main(String[] args) {
		System.out.println("Percentage of A");
		A markA = new A(50,60,70);
		markA.getPercentage();
		
		
		B markB = new B(88,78,99,99);
		System.out.println("Percentage of B");
		
		markB.getPercentage();
	
	}

}
