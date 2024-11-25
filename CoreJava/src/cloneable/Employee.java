package cloneable;


public class Employee implements Cloneable{
	
	int empId;
	String empName;
	int empSalary;
	String empJob;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	void initInfo() {
		empId = 101;
		empName = "Ramesh";
		empSalary = 45000;
		empJob = "Manager";
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empJob=" + empJob
				+ "]";
	}

	void printInfo() {
		System.out.println("Employee ID :"+empId);
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee Salary :"+empSalary);
		System.out.println("Employee Job :"+empJob);
	}
	
public static void main(String[] args) {
	
	Employee e1 = new Employee();
	
	e1.initInfo();
	e1.printInfo();
	
	try {
		Employee e2=(Employee) e1.clone();
		System.out.println(e2);
	} catch (CloneNotSupportedException e) {
		
		e.printStackTrace();
	}
}

}
