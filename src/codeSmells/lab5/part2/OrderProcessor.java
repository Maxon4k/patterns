package codeSmells.lab5.part2;

public class OrderProcessor {
    public void processOrder(Order order) {
        validateOrder(order);
        applyDiscounts(order);
        confirmOrder(order);
    }

    private void validateOrder(Order order) {
        System.out.println("Validating order for " + order.getCustomerName());
    }

    private void applyDiscounts(Order order) {
        System.out.println("Applying discounts to order");
    }

    private void confirmOrder(Order order) {
        System.out.println("Confirming order with total price: " + order.getTotalPrice());
    }
}
