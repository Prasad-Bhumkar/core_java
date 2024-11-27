package exceptionHandling;

public class program1 {
	
	public static void main(String[] args) {
		String name = null;
		System.out.println("hello 1");
		System.out.println("hello 2");
		try {
		System.out.println("hello 3"+name.length());
		}catch (NullPointerException e) {
			System.out.println("this is user defined message ");
			System.out.println("this message via e.getMessage() :");
			System.out.println(e.getMessage());
			System.out.println("this is message via e.printStackTrace() :");
			e.printStackTrace();
		}
		
		System.out.println("hello 4");
		System.out.println("hello 5");
		System.out.println("hello 6");
		System.out.println("hello 7");
	}
}
