package ArraysInJava;

public class BasicArray 
{
	
	//declaration type 1
	
	int arr1[] = new int[5];
	{
	arr1[0]=10;
	arr1[1]=20;
	arr1[2]=30;
	arr1[3]=40;
	arr1[4]=50;
	}
	//declaration type 2
	int arr2[] = {78,95,46,23,57,68};
	
	
	public void printArray() 
	{
		System.out.println("Array 1 :");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		System.out.println("Array 2 :");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
	}
	
	
	
	
}