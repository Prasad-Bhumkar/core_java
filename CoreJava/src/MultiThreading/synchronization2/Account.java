package MultiThreading.synchronization2;

public class Account {

	private int accNo;
	private String name;
	private double balance;
	
	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	public synchronized void withdraw(double amount) throws InterruptedException{
		
		System.out.println("Balance before withdrawal : "+balance);
		
		balance=balance-amount;
		
		Thread.sleep(4000);
		
		System.out.println("Balace after withdrawal : "+balance);
		
		Thread.sleep(4000);
	}
	
	public synchronized void deposit(double amount) throws InterruptedException{
		
		System.out.println("Balance before withdrawal : "+balance);
		
		balance=balance+amount;
		
		Thread.sleep(4000);
		
		System.out.println("Balace after withdrawal : "+balance);
		
		Thread.sleep(4000);
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
}
