package Ecommerce;

public class EcommerceDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Customer c1 = new Customer("Aditi");
        Order o1 = new Order(p1, 2);

        c1.displayCustomer();
        System.out.println();
        o1.displayOrder();
    }
}