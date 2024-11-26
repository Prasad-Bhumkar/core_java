package innerclass;

public class Outer {
	
	private int a=10;
	
	public void outerMethod()
	{
		System.out.println("This is outer class method!");
		System.out.println("This is outer class variable a : "+a);
	}
	//outer class cannot access members of inner class 
	//but inner class can access members of outer class
	
	class Inner
	{
		private int b=20;
		 
		public void innerMethod()
		{
			System.out.println("This is inner class method!");
			System.out.println("This is outer class variable a : "+a);
			System.out.println("This is inner class variable b : "+b);
		}
	}
}
