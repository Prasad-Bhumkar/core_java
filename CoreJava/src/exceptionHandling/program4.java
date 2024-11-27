package exceptionHandling;

public class program4 {
	
	public static void main(String[] args) {
		String name = null;
		int a = 10;
		int b = 0;
		System.out.println("hello 1");
		System.out.println("hello 2");
		try {
			try {
				System.out.println("Division : "+a/b);
			} catch (Exception e) {
				e.printStackTrace();
			}
		System.out.println("hello 3"+name.length());
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("hello 5");
		System.out.println("hello 6");
		System.out.println("hello 7");
	}
}
