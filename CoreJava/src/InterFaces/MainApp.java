package InterFaces;

public class MainApp {

	public static void main(String[] args) {
		
		Shape s1 = new Circle(5);
		double areaOfCircle = s1.area();
		System.out.println("Area of circle : "+areaOfCircle);
		
		Shape s2 = new Rectangle(5,10);
		Printable rect=new Rectangle();
		
	}

}
