package main.design_patterns.strategy;

public class CreditCardPayment implements IPaymentStrategy {
    @Override
    public void getPaymentDetails() {
        System.out.println("Credit Card Payment dummy");
    }
}
