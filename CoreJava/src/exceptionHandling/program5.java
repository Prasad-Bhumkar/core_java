package exceptionHandling;

public class program5 {
	
	public static void main(String[] args) {
		String name = null;
		System.out.println("hello 1");
		System.out.println("hello 2");
		//finally block gets executed even if exception occured or not
		//it is used to close costly resources before termination and to prevent data leakage
		//finally when exception is handled
		try {
		System.out.println("hello 3"+name.length());
		}catch (NullPointerException e) {
			
			e.printStackTrace();
		}
		finally {
			System.out.println("message from finally block");
		}
		//finally when exception is not handled
//		try {
//			System.out.println("hello 3"+name.length());
//			}
//			finally {
//				System.out.println("message from finally block");
//			}
		
		System.out.println("hello 4");
		System.out.println("hello 5");
		System.out.println("hello 6");
		System.out.println("hello 7");
	}
}
