package Relp.practise;





public class Math implements Functions{

		@Override
		public void display(String str) {
			System.out.println(str);
		}

		@Override
		public double adding(double firstNumber, double SecondNumber) {
			double total = firstNumber+SecondNumber;
			System.out.println("Result is :::"+total);
			return total;
			
		}

		@Override
		public double subtracting(double firstNumber, double SecondNumber) {
			double rem = firstNumber-SecondNumber;
			System.out.println("Result is :::"+rem);
			return rem;
		}

		@Override
		public double multiply(double firstNumber, double SecondNumber) {
			double multi = firstNumber*SecondNumber;
			System.out.println("Result is :::"+multi);
			return multi;	}

		@Override
		public double dividing(double firstNumber, double SecondNumber) {
			double div = firstNumber/SecondNumber;
			System.out.println("Result is :::"+div);
			return div;
		}
		public static void main(String[] args) {
			Math mm = new Math();
			mm.adding(60, 60);
			mm.subtracting(90, 10);
			mm.multiply(200, 10);
			mm.dividing(100, 20);
			
			
			
			
			}
	}

