package GetterSetterHomework;

public class MainCustomer {
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		
		c1.setCustomerId(501);
		int id = c1.getCustomerId();
		
		c1.setCustomerName("Manish");
		String name = c1.getCustomerName();
		
		c1.setCustomerAge(24);
		int age = c1.getCustomerAge();
		
		System.out.println("Customer Details :");
		System.out.println("Customer ID : "+id);
		System.out.println("Customer Name : "+name);
		System.out.println("Customer Age : "+age);
	}

}
