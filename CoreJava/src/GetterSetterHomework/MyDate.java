package GetterSetterHomework;

public class MyDate {
	
	private int dayOfDate;
	private String monthOfDate;
	private int yearOfDate;
	
	public void setDayOfDate(int day)
	{
		dayOfDate = day;
	}
	
	public int getDayOfDate()
	{
		return dayOfDate;
	}
	
	public void setMonthOfDate(String month)
	{
		monthOfDate = month;
	}
	
	public String getMonthOfDate()
	{
		return monthOfDate;
	}
	
	public void setYearOfDate(int year)
	{
		yearOfDate = year;
	}
	
	public int getYearOfDate()
	{
		return yearOfDate;
	}
}
