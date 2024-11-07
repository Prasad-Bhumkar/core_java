package basicJava;

public class product {
	
	int productId;
	String productName;
	int productPrice;
	
	void initInfo() {
		productId = 1;
		productName = "Notebook";
		productPrice = 50;
	}
	
	void printInfo() {
		System.out.println("Product Id :"+productId);
		System.out.println("Product Name"+productName);
		System.out.println("Product Price :"+productPrice);
	}

	public static void main(String[] args) {
		product p1 = new product();
		
		p1.initInfo();
		p1.printInfo();

	}

}
