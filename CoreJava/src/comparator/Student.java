package comparator;

public class Student {
	
	int studId ;
	String studName ;
	double studMarks ;
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studMarks=" + studMarks + "]";
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public double getStudMarks() {
		return studMarks;
	}
	public void setStudMarks(double studMarks) {
		this.studMarks = studMarks;
	}
	public Student(int studId, String studName, double studMarks) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studMarks = studMarks;
	}
	
	
	
	
	}




