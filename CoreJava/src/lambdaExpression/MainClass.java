package lambdaExpression;

public class MainClass {

	public static void main(String[] args) {

		Printable p = ()->{
			System.out.println("This is implementation of lambda expression!");
			
		};
		p.print();
	}
}
