package Relp.practise;

public interface Outputs {
	void display(String str);
	
}
interface Functions extends Outputs{
	double adding(double firstNumber,double SecondNumber);
	double subtracting(double firstNumber,double SecondNumber);
	double multiply(double firstNumber,double SecondNumber);
	double dividing(double firstNumber,double SecondNumber);
	
}


