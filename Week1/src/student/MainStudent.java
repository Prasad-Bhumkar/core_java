package student;

import java.util.Scanner;


public class MainStudent {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int choice;
        Student s=null;
        do {
            System.out.println("Are you studying in 'ABC Technical Institute'?");
            System.out.println("1. yes");
            System.out.println("2. no");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                // Create and process student from abc institute
                System.out.print("Enter your student ID : ");
                scanner.nextLine();
                String studId = scanner.nextLine(); // Changed to int
                System.out.print("Enter your Name : ");
                String studName = scanner.nextLine();
                System.out.print("Enter your Address: ");
                String studAddress = scanner.nextLine();
                
                 s = new Student(studId,studName,studAddress); // Now passing all parameters
                
            } 
            else if (choice == 2) {
                // Create and process a Developer
            	System.out.print("Enter your student ID : ");
            	scanner.nextLine();
                String studId = scanner.nextLine(); // Changed to int
                System.out.print("Enter your Name : ");
                String studName = scanner.nextLine();
                System.out.print("Enter your Address : ");
                String studAddress = scanner.nextLine();
                System.out.print("Enter your College Name : ");
                String collegeName = scanner.nextLine();
                
                 s = new Student(studId,studName,studAddress,collegeName); // Now passing all parameters
                
            } 
            else if (choice == 3) {
                System.out.println("Exiting the program.");
                choice=3;
            } 
            else {
                System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("Student ID : "+s.getStudentId());
            System.out.println("Student Name : "+s.getStudentName());
            System.out.println("Student Address :"+s.getStudentAddress());
            System.out.println("College Name : "+s.getCollegeName());
            System.out.println(); // Add an empty line for better readability
        } while (choice != 3); // Continue until user chooses to exit

        scanner.close();
    }

	}


