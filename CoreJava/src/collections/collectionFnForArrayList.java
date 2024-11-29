package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collectionFnForArrayList {

	public static void main(String[] args) {
		
		//parent class refrence holds child class object
		List list = new ArrayList();
		
		//.add() to add data directly in collection
		list.add(47);
		list.add(78.2);
		list.add("prasad");
		list.add(666666);
		
		//1.print entire list
		System.out.println("Before any operations :");
		System.out.println(list);
		
		//2.add element at desired index
		list.add(4,56);
		System.out.println(" After adding element :");
		System.out.println(list);
		
		//3.set at desired position
		list.set(1, 50);
		System.out.println(" After settinging element :");
		System.out.println(list);
		
		//4.size of list
		System.out.println("size of arraylist : "+list.size());
		
		//5.contains specific element or not
		System.out.println("Arraylist contains value 47 ??\t"+list.contains(47));
		
		//6.removing element
		list.remove(4);
		System.out.println("After removing 4th element :");
		System.out.println(list);
	}
}
