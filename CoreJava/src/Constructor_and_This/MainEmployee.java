package Constructor_and_This;

public class MainEmployee {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		int empId = e1.getEmpId();
		String empName = e1.getEmpName();
		int empSalary = e1.getEmpSalary();
		String empJob = e1.getEmpJob();
		
		System.out.println("Employee ID :"+empId);
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee Salary :"+empSalary);
		System.out.println("Employee Job :"+empJob);
		
		System.out.println("========================================");
		
		Employee e2 = new Employee(512,"Sanket",65000,"HR");
		
		e2.printInfo();
	}
}
