package InterFaces;

public class Circle extends Shape{
	
	private final double PI=3.14;
	private double radius;
	
	
	@Override
	public double area() {
		
		return PI*radius*radius;
	}


	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	

	
	
}