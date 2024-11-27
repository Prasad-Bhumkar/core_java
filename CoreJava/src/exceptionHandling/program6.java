package exceptionHandling;

public class program6 {
	
	public static void main(String[] args) {
		
		int a = 23;
		int b = 5;
		
		if (b==5) {
			//creating user defined exception using throw keyword
			throw new ArithmeticException();
		} else {
			System.out.println("division is : "+a/b);
		}
	}
}
//homework checked vs unchecked,throw vs throws