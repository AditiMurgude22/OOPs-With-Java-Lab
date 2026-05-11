package Ecommerce;

public class Order {
    Product product;
    int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return product.price * quantity;
    }

    public void displayOrder() {
        product.displayProduct();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotal());
    }
}