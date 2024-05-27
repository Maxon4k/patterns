package codeSmells.lab5.part2;

import java.util.List;

public class Order {
    private String customerName;
    private List<Item> items;
    private double totalPrice;

    public Order(String customerName, List<Item> items) {
        this.customerName = customerName;
        this.items = items;
        this.totalPrice = calculateTotalPrice();
    }

    private double calculateTotalPrice() {
        double price = 0.0;
        for (Item item : items) {
            price += item.getPrice();
        }
        return price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
