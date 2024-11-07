package GetterSetterHomework;

public class MainProduct {

    public static void main(String[] args) {
        Product p1 = new Product();
        
        p1.setProductId(3002);
        int id = p1.getProductId();
        
        p1.setProductName("Laptop");
        String name = p1.getProductName();
        
        p1.setProductPrice(74000);
        int price = p1.getProductPrice();

        System.out.println("Producct Details :");
        System.out.println("Product ID : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Product Price : " + price);
    }

}
