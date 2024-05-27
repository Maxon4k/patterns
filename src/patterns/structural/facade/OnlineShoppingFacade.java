package patterns.structural.facade;

// OnlineShoppingFacade.java
public class OnlineShoppingFacade {
    private Inventory inventory;
    private PaymentGateway paymentGateway;
    private ShoppingCart shoppingCart;

    public OnlineShoppingFacade() {
        inventory = new Inventory();
        paymentGateway = new PaymentGateway();
        shoppingCart = new ShoppingCart();
    }

    public void addToCart(String productID, int quantity) {
        if (inventory.isAvailable(productID, quantity)) {
            shoppingCart.addProduct(productID, quantity);
            System.out.println(quantity + " units of " + productID + " added to cart.");
        } else {
            System.out.println("Sorry, " + productID + " is not available in desired quantity.");
        }
    }

    public void checkout(String paymentMethod) {
        if (shoppingCart.isEmpty()) {
            System.out.println("Shopping cart is empty.");
            return;
        }
        double totalAmount = shoppingCart.calculateTotal();
        paymentGateway.processPayment(paymentMethod, totalAmount);
    }
}
