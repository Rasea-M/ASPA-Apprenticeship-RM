package main.design_patterns.strategy;

public class PayPalPayment implements IPaymentStrategy {
    @Override
    public void getPaymentDetails() {
        System.out.println("PayPalPayment dummy");
    }
}
