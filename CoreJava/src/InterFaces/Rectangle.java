package InterFaces;

public class Rectangle extends Shape implements Printable{
		
	private double length;
	private double breadth;
	
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
		
	}

	@Override
	public double area() {
		
		return length*breadth;
	}
	
	@Override
	public void print() {
		System.out.println("Area of Rectangle : "+area());
		
	}
}
