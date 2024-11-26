package anonymousInnerClass;

public class MainApp {

	public static void main(String[] args) {
		
		Shape s = new Shape() {

			@Override
			double area() {
				
				return 50*2;
			}
			
			@Override
			double perimeter()
			{
				return 5+5+5;
				
			}
		};
		
		System.out.println("Area : "+s.area());
		System.out.println("Perimeter : "+s.perimeter());
	}
}
