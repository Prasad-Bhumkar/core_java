package exceptionHandling;

public class program2 {
	
	public static void main(String[] args) {
		String name = null;
		int a = 10;
		int b = 0;
		System.out.println("hello 1");
		System.out.println("hello 2");
		//one try block can have multiple catch blocks 
		//but it can throw object of only one exception class
		//but it can handle multiple exceptions
		//exception is handled but message is not shown for NullPointerException
		try {
			System.out.println("Division : "+a/b);
		System.out.println("hello 3"+name.length());
		}catch (NullPointerException e) {
			e.printStackTrace();
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("hello 4");
		System.out.println("hello 5");
		System.out.println("hello 6");
		System.out.println("hello 7");
	}
}
