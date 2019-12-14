package Relp.practise;



interface ParentInterface{
	void parentMethod();
}
interface ChildInterface extends ParentInterface{
	void childMethod();
}


public class Hw176 implements ChildInterface{

	@Override
	public void childMethod() {
		System.out.println("Child Method-----hi syntax solutions how are you");
	}
	
	@Override
	public void parentMethod() {
		System.out.println("Parent Method-----welcome to syntax solutions");
		
	}
	public static void main(String[] args) {
		Hw176 mm = new Hw176();
		mm.parentMethod();
		mm.childMethod();
	}

}
