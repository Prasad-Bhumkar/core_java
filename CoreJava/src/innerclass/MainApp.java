package innerclass;

public class MainApp {
		
	public static void main(String[] args) {
		Outer o = new Outer();
		o.outerMethod();
		
		//for creating object of inner class we use refrence as classname and objectname of outer class
		
		Outer.Inner in = o.new Inner();
		in.innerMethod();
	}
}
