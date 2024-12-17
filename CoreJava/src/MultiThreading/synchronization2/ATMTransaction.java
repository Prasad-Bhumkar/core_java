package MultiThreading.synchronization2;

public class ATMTransaction extends Thread{
	
	Account ac;
	double amount;
	String flag;
	
	public ATMTransaction(Account ac, double amount, String flag) {
		super();
		this.ac = ac;
		this.amount = amount;
		this.flag = flag;
	}
	
	@Override
	public void run() {
	
		try {
			if (flag.equals("withdraw")) {
				ac.withdraw(amount);
			} else {
				ac.deposit(amount);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Account ac = new Account(6022257, "Rohit Patil", 100000);
		
		Thread t1 = new ATMTransaction(ac, 20000, "withdraw");
		Thread t2 = new ATMTransaction(ac, 10000, "deposit");
		
		t1.start();
		t2.start();
	}
}
