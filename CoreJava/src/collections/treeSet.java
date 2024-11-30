package collections;

import java.util.Set;
import java.util.TreeSet;

public class treeSet {
	
	public static void main(String[] args) {
		
		Set<Integer> set1 = new TreeSet<Integer>();
		
		set1.add(95);
		set1.add(15);
		set1.add(65);
		set1.add(35);
		set1.add(75);
		set1.add(85);
		
		System.out.println(set1);
	}
}
