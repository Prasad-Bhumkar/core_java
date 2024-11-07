package basicJava;

public class Employee {
	
	int empId;
	String empName;
	int empSalary;
	String empJob;
	
	void initInfo() {
		empId = 101;
		empName = "Ramesh";
		empSalary = 45000;
		empJob = "Manager";
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
}

}
