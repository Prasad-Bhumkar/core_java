package ToString;

public class Student {
		
	int studId ;
	String studName ;
	double studMarks ;
	
	
	
	
	public Student() {
		super();
	}




	public Student(int studId, String studName, double studMarks) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studMarks = studMarks;
	}




	@Override
	public String toString() {
		return "Student Details : \nstudId=" + studId + "\nstudName=" + studName + "\nstudMarks=" + studMarks;
	}
	
	
	
	
}
