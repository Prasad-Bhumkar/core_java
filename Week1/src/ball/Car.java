package ball;

public class Car implements movable, bounceable{

	@Override
	public void move() {
		System.out.println("The car moves!");
		
	}

	@Override
	public void bounce() {
		System.out.println("The Dancing car!");
		
	}

}
