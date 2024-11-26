package accountForInnerClassExample;

public class MainApp {
		
	public static void main(String[] args) {
		
		Account A60222 = new Account(602524757, "Savings", 50624);
		
		Account.Locker L60222= A60222.new Locker(657854, "pass@123");
		
		System.out.println("Account Details :");
		System.out.println("Account Number : "+A60222.getAccNumber()
							+"\nAccount Type :"+A60222.getAccType()
							+"\nAccount Balance :"+A60222.getAccBalance());
		System.out.println("Locker Details :");
		System.out.println("Locker ID : "+L60222.getLockerID()
							+"\nLocker Password :"+L60222.getLockerPassword());
	}
}
