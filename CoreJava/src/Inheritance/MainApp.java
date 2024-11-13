package Inheritance;

public class MainApp {
		
	public static void main(String[] args) {
		//Employee  emp = new Employee (50000, 500, 300);
		
		//emp.calCulateSalary();
		//emp.getIncentive();   ...this will give compile time error because parent class cannot access props of child class
		
		Manager mgr = new Manager(6500, 55000, 500, 300);
		
		int sal = mgr.getIncentive();
		int inc = mgr.calCulateSalary();
		
		System.out.println("Salary of Manager :"+(sal+inc));
	}
}
