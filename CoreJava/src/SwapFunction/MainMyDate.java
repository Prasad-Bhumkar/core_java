package SwapFunction;

public class MainMyDate {
	public static void main(String[] args) {
		
		
		MyDate d1 = new MyDate();
		MyDate d2 = new MyDate(13,8,2001);
		
		
		System.out.println("Before Swapping :\n");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("========================");
		
		MainMyDate.swap(d1,d2);
		
		
	}
	
	public static void swap(MyDate dd1,MyDate dd2)
	{
		//temp variable should be of Mydate type because we swapping values of object type
		
		MyDate temp = dd1;
		dd1=dd2;
		dd2=temp;
		
		System.out.println("After Swapping :\n");
		System.out.println(dd1);
		System.out.println(dd2);
		System.out.println("========================");
	}
}
