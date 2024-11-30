package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ObjectsInArraylist2 {
	
	public static void main(String[] args) {
		
		List<Student> studList = new ArrayList<Student>();
		
		//to add in arraylist method1
		Student e1 = new Student(125,"prasad",55);
		studList.add(e1);
		
		//to add in arraylist method2 
		studList.add(new Student(123,"sagar",95));
		studList.add(new Student(121,"zeel",65));
		studList.add(new Student(124,"vaibhavi",75));
		studList.add(new Student(122,"sarthak",85));
		
		
		System.out.println("================ Unsorted student list : =============");
		for(Student stud:studList)
		{
			System.out.println(stud);
		}
		
		System.out.println(" ");
		System.out.println("============= sorted student list by studId : =============");
		Collections.sort(studList,new SortedBystudId());
		for(Student stud:studList)
		{
			System.out.println(stud);
		}
		
		System.out.println(" ");
		System.out.println("============= sorted student list by studName : =============");
		Collections.sort(studList,new SortedBystudName());
		for(Student stud:studList)
		{
			System.out.println(stud);
		}
		
		System.out.println(" ");
		System.out.println("=============sorted employee list by empSal : =============");
		Collections.sort(studList,new SortedBystudMarks());
		for(Student stud:studList)
		{
			System.out.println(stud);
		}
	}
}
