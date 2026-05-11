package Ecommerce;

public class Product {
    String productName;
    double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
    }
}