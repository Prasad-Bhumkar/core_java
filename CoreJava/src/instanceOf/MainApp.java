package instanceOf;

import java.util.Scanner;

public class MainApp {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Create Manager");
            System.out.println("2. Create Developer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                // Create and process a Manager
                System.out.print("Enter base salary for Manager: ");
                int managerSalary = scanner.nextInt(); // Changed to int
                System.out.print("Enter HRA for Manager: ");
                int hra = scanner.nextInt();
                System.out.print("Enter DA for Manager: ");
                int da = scanner.nextInt();
                System.out.print("Enter incentive for Manager: ");
                int incentive = scanner.nextInt();
                Employee emp1 = new Manager(managerSalary, hra, da, incentive); // Now passing all parameters
                printEmployeeSalary(emp1);
            } 
            else if (choice == 2) {
                // Create and process a Developer
                System.out.print("Enter base salary for Developer: ");
                int developerSalary = scanner.nextInt(); // Changed to int
                System.out.print("Enter HRA for Developer: ");
                int hra = scanner.nextInt();
                System.out.print("Enter DA for Developer: ");
                int da = scanner.nextInt();
                System.out.print("Enter night allowance for Developer: ");
                int nightAllowance = scanner.nextInt();
                Employee emp2 = new Developer(developerSalary, hra, da, nightAllowance); // Now passing all parameters
                printEmployeeSalary(emp2);
            } 
            else if (choice == 3) {
                System.out.println("Exiting the program.");
            } 
            else {
                System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); // Add an empty line for better readability
        } while (choice != 3); // Continue until user chooses to exit

        scanner.close();
    }

    private static void printEmployeeSalary(Employee emp) {
        if(emp instanceof Manager) {
            Manager mgr = (Manager) emp; // Downcast to Manager
            int sal = mgr.calculateSalary(); // Calculate salary for Manager
            System.out.println("Salary of Manager : " + sal); // Print total salary
        } 
        else if(emp instanceof Developer) {
            Developer dev = (Developer) emp; // Downcast to Developer
            int sal = dev.calculateSalary(); // Calculate salary for Developer
            System.out.println("Salary of Developer : " + sal); // Print total salary
        } 
        else {
            System.out.println("Employee is neither Manager nor Developer");
        }
    }
}