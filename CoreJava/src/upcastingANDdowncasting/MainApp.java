package upcastingANDdowncasting;

public class MainApp {
		
	public static void main(String[] args) {
		
		//non-primitivetypecasting have 2 types 
		//1. upcasting - Superclass refrence variable holds subclass object
		
		Employee emp = new Manager(6500, 55000, 500, 300);
		
		//2. downcasting - subclass refrence variable holds superclass upcasted object
		
		//ClassCastException will be occured at runtime when we try to doncast an object which was never upcasted
		
		Manager mgr=(Manager) emp;
		
		int inc = emp.calCulateSalary();
		
		int sal = mgr.getIncentive();
		
		System.out.println("Salary of Manager :"+(sal+inc));
	}
}
