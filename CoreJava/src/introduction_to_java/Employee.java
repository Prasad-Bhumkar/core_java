package introduction_to_java;

public class Employee {
	private int empId;
	private String empName;
	private int empSalary;
	private String empJob;
	
	public void setEmpId(int id)
	{
		empId=id;
	}
	
	public int getEmpId()
	{
		return empId;
	}
	
	public void setEmpName(String name)
	{
		empName=name;
	}
	
	public String getEmpName()
	{
		return empName;
	}
	
	public void setEmpSalary(int salary)
	{
		empSalary=salary;
	}
	
	public int getEmpSalary()
	{
		return empSalary;
	}
	
	public void setEmpJob(String job)
	{
		empJob=job;
	}
	
	public String getEmpJob()
	{
		return empJob;
	}
}