package MethodOverriding;

public class Employee {
	
	private int basicSal;
	private int hra;
	private int da;
	
	public int calCulateSalary()
	{
		return basicSal+hra+da;
	}

	public Employee(int basicSal, int hra, int da) {
		super();
		this.basicSal = basicSal;
		this.hra = hra;
		this.da = da;
	}
	
	
}
