package introduction_to_java;

public class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setEmpId(101);
        e1.setEmpName("prasad");
        e1.setEmpSalary(10000);
        e1.setEmpJob("Manager");

        int id = e1.getEmpId();
        String name = e1.getEmpName();
        double salary = e1.getEmpSalary();
        String job = e1.getEmpJob();
        
        
        System.out.println("Employee Details :");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Job: " + job);
    }
}
