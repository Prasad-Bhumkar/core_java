package Chapter2;

public class MyDate {
	private	int day=13;
	private	int month=8;
	private int year=2001;
	
	public void initdate()
	{
		System.out.println("Date of Birth :- "+day+"/"+month+"/"+year);
	}
	
	public static void main(String[] args) {
		MyDate dob = new MyDate();
		dob.initdate();
	}
}
