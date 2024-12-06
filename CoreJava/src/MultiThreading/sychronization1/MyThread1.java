package MultiThreading.sychronization1;

public class MyThread1 extends Thread{
	
	String []arr = {"java","is","object","oriented","programming","language"};

	public MyThread1(String name) {
		super(name);
	}
	
	@Override
	public void run() {
	
		Display.display(arr);
	}
}
