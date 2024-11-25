package ball;

public class Ball implements bounceable,movable{

	@Override
	public void move() {
		System.out.println("The ball bounces!");
		
	}

	@Override
	public void bounce() {
		System.out.println("The ball moves!");
		
	}
	
}
