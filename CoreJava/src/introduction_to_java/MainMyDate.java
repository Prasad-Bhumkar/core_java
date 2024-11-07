package introduction_to_java;

public class MainMyDate {
	public static void main(String[] args) {
		
		MyDate d1 = new MyDate();
		
		d1.setDayOfDate(17);
		int day = d1.getDayOfDate();
		
		d1.setMonthOfDate("November");
		String month = d1.getMonthOfDate();
		
		d1.setYearOfDate(2015);
		int year = d1.getYearOfDate();
		
		
		System.out.println("Date : "+day+"/"+month+"/"+year);
	}
}
