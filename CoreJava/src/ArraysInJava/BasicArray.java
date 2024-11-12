package ArraysInJava;

public class BasicArray 
{
	
	//declaration 1
	
	int arr1[] = new int[5];
	arr1[0]=10;
	arr1[1]=20;
	arr1[2]=30;
	arr1[3]=40;
	arr1[4]=50;
	
	
	public BasicArray() {
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}
	
	
	
	
}
