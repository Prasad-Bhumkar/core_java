package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import collections.Employee;

public class ObjectsInArraylist {
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		//to add in arraylist method1
		Employee e1 = new Employee(125,"prasad",55000);
		empList.add(e1);
		
		//to add in arraylist method2 
		empList.add(new Employee(123,"sagar",95000));
		empList.add(new Employee(121,"zeel",65000));
		empList.add(new Employee(124,"vaibhavi",75000));
		empList.add(new Employee(122,"sarthak",85000));
		
		
		System.out.println("================ Unsorted employee list : =============");
		for(Employee emp:empList)
		{
			System.out.println(emp);
		}
//		System.out.println(" ");
//		System.out.println("=============sorted employee list by empId : =============");
//		Collections.sort(empList);
//		for(Employee emp:empList)
//		{
//			System.out.println(emp);
//		}
		
		System.out.println(" ");
		System.out.println("=============sorted employee list by empName : =============");
		Collections.sort(empList);
		for(Employee emp:empList)
		{
			System.out.println(emp);
		}
	}
}
