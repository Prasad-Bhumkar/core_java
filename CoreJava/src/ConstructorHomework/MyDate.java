package ConstructorHomework;

public class MyDate {
	
	private int dayOfDate;
	private String monthOfDate;
	private int yearOfDate;
	
	public MyDate()
	{
		dayOfDate = 23;
		monthOfDate = "March";
		yearOfDate = 2003;
	}
	
	public MyDate(int day,String month,int year)
	{
		dayOfDate = day;
		monthOfDate = month;
		yearOfDate = year;
	}

	public void printInfo() {
		System.out.println("Date: " + dayOfDate + " " + monthOfDate + " " + yearOfDate);
		
	}
}
