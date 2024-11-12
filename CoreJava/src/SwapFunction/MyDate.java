package SwapFunction;

public class MyDate {
		int day,month,year;
		
		

		public MyDate() {
			day=1;
			month=1;
			year=1999;
		}



		public MyDate(int day, int month, int year) {
			super();
			this.day = day;
			this.month = month;
			this.year = year;
		}



		@Override
		public String toString() {
			return "MyDate : \n" + day + "/" + month + "/" + year;
		}
		
		
		
		
}
