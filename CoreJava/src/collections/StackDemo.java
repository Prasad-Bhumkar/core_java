package collections;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack1 = new Stack<Integer>();
		
		//can use add method also for adding elements 
		stack1.add(11);
		
		//1.push
		stack1.push(22);
		stack1.push(33);
		stack1.push(44);
		stack1.push(55);
		stack1.push(66);
		
		System.out.println(stack1);
		
		//2.peek
		System.out.println("Element by peek :"+stack1.peek());
		System.out.println(stack1);
		
		//3.pop shows and pops the element at topmost
		System.out.println("Element by pop : "+stack1.pop());
		System.out.println(stack1);
		
		//4.remove shows and deletes element at required index
		System.out.println("Element by remove : "+stack1.remove(3));
		System.out.println(stack1);
		
		//5.search element 
		System.out.println(44);
		
	}
}
