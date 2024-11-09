package VariableScopes;

public class Student1 {
	private int studId ;
	private String studName ;
	private double studMarks ;
	private static int autoID;
	
	static{
		autoID = 100;
	}
	
	
	
	public Student1()
	{
		autoID++;
		studId=autoID;
	}
	
	public Student1(String name,double marks)
	{
		autoID++;
		studId=autoID;
		
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
