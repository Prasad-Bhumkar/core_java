package accountForInnerClassExample;

public class Account {
	
	private long accNumber;
	private String accType;
	private double accBalance;
	
	public Account(long accNumber, String accType, double accBalance) {
		super();
		this.accNumber = accNumber;
		this.accType = accType;
		this.accBalance = accBalance;
	}

	public long getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}


	
	class Locker
	{
		private int lockerID;
		private String lockerPassword;
		
		public Locker(int lockerID, String lockerPassword) {
			super();
			this.lockerID = lockerID;
			this.lockerPassword = lockerPassword;
		}

		public int getLockerID() {
			return lockerID;
		}

		public void setLockerID(int lockerID) {
			this.lockerID = lockerID;
		}

		public String getLockerPassword() {
			return lockerPassword;
		}

		public void setLockerPassword(String lockerPassword) {
			this.lockerPassword = lockerPassword;
		}
		
		
		
	}
}
