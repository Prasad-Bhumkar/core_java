package Containment;

import basicJava.myDate;

public class Employee {
	
	private int empId;
	private String empName;
	private double empSalary;
	private myDate joiningDate;
	                                                                                                                                                              
	public Employee() {
		empId=101;
		empName="Ravi";
		empSalary=55000;
		joiningDate=new myDate();
		
	}

	
	public Employee(int empId, String empName, double empSalary, myDate joiningDate) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.joiningDate = joiningDate;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", joiningDate="
				+ joiningDate + "]";
	}
	
	
	
}
