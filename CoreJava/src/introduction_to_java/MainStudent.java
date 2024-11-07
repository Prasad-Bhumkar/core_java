package introduction_to_java;

public class MainStudent {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setStudId(101);
		int id = s1.getStudId();
		
		s1.setStudName("prasad");
		String name = s1.getStudName();
		
		s1.setStudMarks(65);
		double marks = s1.getStudMarks();
		
		
		
		
		System.out.println("Student Id :"+id+"\nStudent Name :"+name+"\nStudent Marks :"+marks);
	}
}
