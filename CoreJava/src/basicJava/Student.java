package basicJava;

public class Student {
	
	int studId ;
	String studName ;
	double studMarks ;
	
	void initInfo() {
		studId = 30;
		studName = "prasad";
		studMarks = 56;
	}
	
	void printInfo() {
		System.out.println("Student Id :"+studId);
		System.out.println("Student Name :"+studName);
		System.out.println("Student Marks :"+studMarks);
	}
	
	public static void main(String[] args) {
		
		
		Student s = new Student();
		
		s.initInfo();
		s.printInfo();
		
	}

}
