package collections;

import java.util.HashSet;
import java.util.Set;

public class hashSet {
	
	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<Integer>();
		
		s1.add(10);
		s1.add(40);
		s1.add(55);
		s1.add(79);
		
		//printing whole hashset
		System.out.println(s1);
		
		//contains
		System.out.println("Does it contain 40 :"+s1.contains(40));
		
		//remove
		s1.remove(10);
		System.out.println("After removing 10 :"+s1);
		
		//isempty
		if(s1.isEmpty())
		{
			System.out.println("Empty hashset!!!!!!!!!!");
		}
		else {
			System.out.println(s1);
		}
		
		//size
		System.out.println("Size of hashset is : "+s1.size());
	}
}
