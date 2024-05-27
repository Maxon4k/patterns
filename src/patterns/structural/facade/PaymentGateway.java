package patterns.structural.facade;

public class PaymentGateway {
    public void processPayment(String paymentMethod, double amount) {
        // Process payment using the specified payment method
        System.out.println("Payment of $" + amount + " processed via " + paymentMethod);
    }
}
