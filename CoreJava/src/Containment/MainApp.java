package Containment;

import basicJava.myDate;

public class MainApp {
		
	
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee();
		System.out.println(e1);
		
		Employee e2 = new Employee(102,"Sanket",65000,new myDate(11,5,2024));
		System.out.println(e2);
	}
} 
