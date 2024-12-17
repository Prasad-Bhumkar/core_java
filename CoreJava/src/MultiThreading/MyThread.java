package MultiThreading;

public class MyThread extends Thread{
	
		@Override
		public void run() {
		
			for (int i = 0; i < 5; i++) {
				
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
		
		//creating thread : superclass refrence stores subclass object
		
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		
		//setting names to threads  (current state is runnable)
		
		t1.setName("thread1");
		t2.setName("thread2");
		
		//changing thread state to running by calling start()
		
		t1.start();
		t2.start();
	}

}
