package MultiThreading;

public class MyThread2 extends Thread implements Runnable{
	
		@Override
		public void run() {
			
			for (int i = 0; i < 5; i++) 
			{
				
				System.out.println(i+" "+Thread.currentThread().getName());
				
				//sleep state until thread completes its work
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
			
		}
	
	public static void main(String[] args) {
		
		Runnable r = new MyThread2();
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.setName("thread1");
		t2.setName("thread2");
		
		t1.start();
		t2.start();
	}
}
