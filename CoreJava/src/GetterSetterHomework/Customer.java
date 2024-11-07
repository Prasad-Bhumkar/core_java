package GetterSetterHomework;

public class Customer {
	private int customerId;
	private String customerName;
	private int customerAge;
	
	public void setCustomerId(int id)
	{
		customerId = id;
	}
	
	public int getCustomerId()
	{
		return customerId;
	}
	
	public void setCustomerName(String name)
	{
		customerName = name;
	}
	
	public String getCustomerName()
	{
		return customerName;
	}
	
	public void setCustomerAge(int age)
	{
		customerAge = age;
	}
	
	public int getCustomerAge()
	{
		return customerAge;
	}
}
