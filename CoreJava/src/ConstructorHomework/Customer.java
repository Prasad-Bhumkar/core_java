package ConstructorHomework;

public class Customer {
	private int customerId;
	private String customerName;
	private int customerAge;

	public Customer() {
		customerId = 501;
		customerName = "prasad";
		customerAge = 24;
	}

	public Customer(int id, String name, int age) {
		customerId = id;
		customerName = name;
		customerAge = age;
	}

	public void printInfo() {
		System.out.println("Customer ID: " + customerId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Customer Age: " + customerAge);
	}
}
