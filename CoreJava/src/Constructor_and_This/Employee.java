package Constructor_and_This;

public class Employee {

    int empId;
    String empName;
    int empSalary;
    String empJob;

//default constructor
    public Employee() {
        empId = 101;
        empName = "Ramesh";
        empSalary = 45000;
        empJob = "Manager";
    }
//parameterized constructor
    
    public Employee(int id, String name, int salary, String job) {
    empId = id;
    empName = name;
    empSalary = salary;
    empJob = job;
}

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public String getEmpJob() {
        return empJob;
    }

    public void printInfo()
    {
    	System.out.println("Employee ID :"+empId);
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee Salary :"+empSalary);
		System.out.println("Employee Job :"+empJob);
    }
}
