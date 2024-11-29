package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {

//arraylist is not threadsafe and non synchronized
		
//best for DML operations
		
//duplicates are allowed in all list classes
		
		LinkedList<String> d1 = new LinkedList<String>();
		
		d1.add("prasad");
		d1.add("ravi");
		d1.add("sanket");
		d1.add("david");
		
		//adding at first position
		
		d1.addFirst("sagar");
		
		//adding at last position
		
		d1.addLast("aditya");
		
		
		System.out.println("Before sorting : ");
		System.out.println(d1);
		
		//sorting using sort() method of collections class
		Collections.sort(d1);
		System.out.println("After sorting : ");
		System.out.println(d1);
	}

}
