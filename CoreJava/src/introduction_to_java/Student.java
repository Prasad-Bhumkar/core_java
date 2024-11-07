package introduction_to_java;

public class Student {

	private int studId ;
	private String studName ;
	private double studMarks ;
	
	
	public void setStudId(int id)
	{
		studId=id;
	}
	
	public int getStudId()
	{
		return studId;
	}
	
	public void setStudName(String name)
	{
		studName=name;
	}
	
	public String getStudName()
	{
		return studName;
	}
	
	public void setStudMarks(double marks)
	{
		studMarks=marks;
	}
	
	public double getStudMarks()
	{
		return studMarks;
	}

}
