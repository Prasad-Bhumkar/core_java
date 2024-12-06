package MultiThreading.sychronization1;

public class Display {
	
	public synchronized static void display(String[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Thread.currentThread().getName()+"\t\t"+arr[i]);
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
