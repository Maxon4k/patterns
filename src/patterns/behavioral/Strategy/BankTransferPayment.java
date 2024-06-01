package patterns.behavioral.Strategy;

// BankTransferPayment.java
public class BankTransferPayment implements PaymentStrategy {
    private String accountNumber;
    private String bankName;

    public BankTransferPayment(String accountNumber, String bankName) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using bank transfer.");
    }
}
