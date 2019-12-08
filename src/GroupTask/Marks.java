package GroupTask;

public abstract class Marks {
	/*
	 * We have to calculate the percentage of marks 
	 * obtained in three subjects (each out of 100) by 
	 * student A and in four subjects (each out of 100) by student B. 
	 * Create class ‘Marks’ with an abstract method ‘getPercentage’. 
	 * It is inherited by classes ‘A’ and ‘B’ each having a method 
	 * with the same name which returns the percentage of the students. 
	 * The constructor of student A takes the marks in three subjects 
	 * as its parameters and the marks in four subjects as its parameters for student B. 
	 * Test your code
	 */
	abstract void getPercentage();
	

}
class A extends Marks{
	int m1,m2,m3;
	
	A(int m1, int m2, int m3){
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	@Override
	void getPercentage() {
		System.out.println((m1+m2+m3)/3);
	}
	
}
class B extends Marks{
	int m1,m2,m3,m4;
	
	B(int m1, int m2, int m3, int m4){
		this.m1= m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;	
	}

	@Override
	void getPercentage() {
		System.out.println((m1+m2+m3+m4)/4);
	}
	
}
