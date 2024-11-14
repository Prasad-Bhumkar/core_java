package MethodOverriding;

public class MainApp {
		
	public static void main(String[] args) {
		//Employee  emp = new Employee (50000, 500, 300);
		
		//emp.calCulateSalary();
		//emp.getIncentive();   ...this will give compile time error because parent class cannot access props of child class
		
		Manager mgr = new Manager(65000, 5500, 500, 300);
		
		int mgrsal = mgr.calCulateSalary();
		
		System.out.println("Salary of Manager :"+mgrsal);
		
		
		Developer dev = new Developer(75000, 5000, 500, 300);
		
		int devsal = dev.calCulateSalary();
		
		System.out.println("Salary of Developer :"+devsal);
	}
}
