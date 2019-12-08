package GroupTask;

public interface Shape {
	
	/*
	 * Create an Interface ‘Shape’ with undefined methods as 
	 * calculateArea and calculatePerimiter . 
	 * Create 2 child classes: 
	 * Circle & Square that should have an implementation of area and
	 *  perimeter calculation. Test your code.
	 */

	void calculateArea();
	void calculatePerimiter();
}
class Circle implements Shape{
	int r;
	@Override
	public void calculateArea() {
		double areaCir = 3.14*r*r;
		System.out.println("Area of Circle is "+areaCir);
	}

	@Override
	public void calculatePerimiter() {
		double periCircle = 2*3.14*r;
		System.out.println("Perimiter of circle is "+periCircle);
	}
	
}
class Square implements Shape{
	int length;
	@Override
	public void calculateArea() {
		double areaSquare = length*length;
		System.out.println("Area of square is "+areaSquare);
	}

	@Override
	public void calculatePerimiter() {
		double periSquare = 4*length;
		System.out.println("The perimeter of Square is "+periSquare);
	}
	
}
