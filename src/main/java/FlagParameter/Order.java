package main.java.FlagParameter;

import java.util.ArrayList;
import java.util.Date;

public class Order {

    Customer customer;
    Date date;
    ArrayList<Product> products = new ArrayList<Product>();
    double total;

    public Order(Customer customer, ArrayList<Product> products) {
        this.customer = customer;
        this.products = products;
        date = new Date();
    }

    public void printDeliveryDetails() {
        Shipping shipping = new Shipping();
        shipping.getDeliveryChanges(total, customer.isPrimeUser());
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product, boolean isRemoveAll) {
        if (isRemoveAll) {
            products.clear();
        } else {
            products.remove(product);
        }
    }
}
