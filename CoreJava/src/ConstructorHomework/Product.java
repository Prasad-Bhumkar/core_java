package ConstructorHomework;

public class Product {
	int productId;
	String productName;
	int productPrice;
	
	public Product()
	{
		productId = 75;
		productName = "Bulb";
		productPrice = 300;
	}
	
	public Product(int id,String name,int price)
	{
		productId = id;
		productName = name;
		productPrice = price;
	}
	
	public void printInfo()
	{
		System.out.println("Producct Details :");
        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Product Price : " + productPrice);
	}
}