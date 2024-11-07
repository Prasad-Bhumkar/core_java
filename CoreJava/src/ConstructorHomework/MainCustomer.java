package ConstructorHomework;

public class MainCustomer {

	public static void main(String[] args) {

		Customer c1 = new Customer();

		c1.printInfo();

		Customer c2 = new Customer(502, "ravi", 22);

		c2.printInfo();
	}

}
