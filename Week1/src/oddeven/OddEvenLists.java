package oddeven;

import java.util.ArrayList;
import java.util.Iterator;

public class OddEvenLists {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		ArrayList<Integer> evennumbers = new ArrayList<Integer>();
		
		
		for (int i=11;i<=30;i++)
		{
			numbers.add(i);
		}
		
		System.out.println("numbers :"+numbers);
		for(Integer number:numbers)
		{
			
			if (number%2 == 0) 
			{
				evennumbers.add(number);
			}
			
		}
		System.out.println("even numbers :"+evennumbers);
		
		
	}
}
