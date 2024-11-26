package anonymousInnerClass;

public class Car {

	public static void main(String[] args) {
		
		Ferrari f1 = new Ferrari()
				{
				public void drive()
				{
					System.out.println("This is anonymous class from abstract class ferrari");
				}
				};
				f1.drive();
				
				Drivable d1 = new Drivable()
				{ 
				public void drive()
				{
					System.out.println("This is anonymous class from interface");
				}
				};
				d1.drive();
	}
}
