package collections;

public class Employee implements Comparable<Employee>{

    @Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	int empId;
    String empName;
    int empSalary;


//default constructor
    public Employee() {
        empId = 101;
        empName = "Ramesh";
        empSalary = 45000;
        
    }
//parameterized constructor
    
    public Employee(int id, String name, int salary) {
    empId = id;
    empName = name;
    empSalary = salary;

}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public int compareTo(Employee o) {
		
		//this logic is used when w want to sort baseed on empId
//		if (this.empId>o.empId) 
//		{
//			return 1;
//		}
//		else if(this.empId<o.empId) 
//		{
//			return -1;
//		}
//		else 
//		{
//			return 0;
//		}
		
		return empName.compareTo(o.empName);
	}

  

   
}
