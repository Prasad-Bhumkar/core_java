package basicJava;

public class myDate {
	 
	private int day,month,year;
	
	public void initDate() {
		
		day = 30;
		month = 5;
		year = 2001;
	}
	
	public void printDate() {
		
		System.out.println("Date is : "+day+"/"+month+"/"+year);
	}
	public static void main(String[] args) {
		myDate date1 = new myDate();
		
		date1.initDate();
		date1.printDate();
	}

}
