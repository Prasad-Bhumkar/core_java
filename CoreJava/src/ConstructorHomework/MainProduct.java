package ConstructorHomework;

public class MainProduct {

    public static void main(String[] args) {
        
    	Product p1 = new Product();
    	
    	p1.printInfo();
    	
    	Product p2 = new Product(32,"wire",500);
    	
    	p2.printInfo();
    }

}
