package PassingArrayTofunction;

public class MainMyDate {
	public static void main(String[] args) 
	{
		
		
		MyDate d1 = new MyDate();
		MyDate d2 = new MyDate(13,8,2001);
		
		MyDate[] arr = {d1,d2};
		
		
		System.out.println("Before Swapping :\n");
		for(MyDate d:arr)
		{
			System.out.println(d);
		}
		System.out.println("========================");
		
		MainMyDate.swap(arr);
		
		
	}
	
	public static void swap(MyDate []arr1)
	{
		//temp variable should be of Mydate type because we swapping values of object type
		
		MyDate temp = arr1[0];
		arr1[0]=arr1[1];
		arr1[1]=temp;
		
		System.out.println("After Swapping :\n");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println("========================");
	}
	
}
