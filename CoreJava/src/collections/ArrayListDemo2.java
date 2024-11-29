package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		//parent class refrence holds child class object
		List list = new ArrayList();
		
		//.add() to add data directly in collection
		list.add(47);
		list.add(78.2);
		list.add("prasad");
		list.add(666666);
		
		//using foreach loop
		//data and objects are of 
		for(Object ob:list)
		{
			System.out.println(ob);
		}
	}
}
