package VariableScopes;

public class Student {
	private int studId ;
	private String studName ;
	private double studMarks ;
	private static int count;
	
	public static int getCount()
	{
		return count;
	}
	
	public Student()
	{
		count++;
	}
	
	public Student(int id,String name,double marks)
	{
		count++;
		studId=id;
		studName=name;
		studMarks=marks;
	}
	void printInfo() {
		System.out.println("==================================");
		System.out.println("Student Id :"+studId);
		System.out.println("Student Name :"+studName);
		System.out.println("Student Marks :"+studMarks);
		System.out.println("==================================");
	}
}
