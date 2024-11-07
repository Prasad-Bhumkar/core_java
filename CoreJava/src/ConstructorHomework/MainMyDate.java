package ConstructorHomework;

public class MainMyDate {
	public static void main(String[] args) {
		
		MyDate d1 = new MyDate();
		
		d1.printInfo();
		
		MyDate d2 = new MyDate(13,"June",1995);
		
		d2.printInfo();

	}
}
