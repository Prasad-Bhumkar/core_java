package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
//arraylist is not threadsafe and non synchronized
	//best for DQL operations
	public static void main(String[] args) {
		
		//parent class refrence holds child class object
		List list = new ArrayList();
		
		//.add() to add data directly in collection
		list.add(47);
		list.add(78.2);
		list.add("prasad");
		list.add(666666);
		
		//iterator() iterates whole arraylist and stores data in parent class refrence variable itr
		Iterator itr = list.iterator();
		
		//.hasnext() checks if on next position data is present?? and returns true or false
		//.next return element present on next index
		while (itr.hasNext()) {
		System.out.println(itr.next());	
		}
	}
}
