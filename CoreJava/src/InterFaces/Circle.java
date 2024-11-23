package InterFaces;

public class Circle extends Shape implements Printable{
	
	private final double PI=3.14;
	private double radius;
	private double area;
	
	
	@Override
	public void area() {
		
		area = PI*radius*radius;
		print();
		
	}


	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	@Override
	public void print() {
		System.out.println("Area of circle : "+area);
		
	}
	

	
	
}
