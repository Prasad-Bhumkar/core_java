package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo2 {
	
	public static void main(String[] args) {
		
//linkedlist INTERNALY implements queue
		//fifo data structure
		//sorts data on basis of priority due to use of child class priority queue
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		//can use add method also
		
		que.add(40);
		
		//it have offer function to add elements
		
		que.offer(66);
		que.offer(95);
		que.offer(37);
		
		//before an operation
		System.out.println(que);
		System.out.println("---------------------------------");
		
		//peek method
		System.out.println("Element by peek : "+que.peek());
		System.out.println(que);
		System.out.println("---------------------------------");
		
		//poll method
		System.out.println("Element by poll : "+que.poll());
		System.out.println(que);
		System.out.println("---------------------------------");
		
		//remove method
		System.out.println("Element by remove : "+que.remove(40));
		System.out.println(que);
		System.out.println("---------------------------------");
	}

}
