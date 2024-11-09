package VariableScopes;

public class MainStudent {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"prasad",65);
		Student s2 = new Student(2,"ravi",85);
		
		s1.printInfo();
		s2.printInfo();
		
		Student1 s101 = new Student1("sanket",75);
		Student1 s102 = new Student1("sarthak",85);
		
		s101.printInfo();
		s102.printInfo();
	}
}
