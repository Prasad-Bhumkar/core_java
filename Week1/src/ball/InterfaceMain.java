package ball;

public class InterfaceMain {
	
	public static void main(String[] args) {
		bounceable b1 = new Ball();
		b1.bounce();
		movable b2 = new Ball();
		b2.move();
		
		bounceable c1 = new Car();
		c1.bounce();
		movable c2 = new Car();
		c2.move();
	}
}
