package patterns.structural.facade;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Integer> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public void addProduct(String productID, int quantity) {
        items.put(productID, items.getOrDefault(productID, 0) + quantity);
    }

    public double calculateTotal() {
        double total = 0;
        // Calculate total price of items in the cart
        return total;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}