package MultiThreading.sychronization1;

public class MainApp {
	
	public static void main(String[] args) {
		
		Thread t1 = new MyThread1("Shahrukh");
		Thread t2 = new MyThread1("Salman");
		
		t1.start();
		t2.start();
	}

}
