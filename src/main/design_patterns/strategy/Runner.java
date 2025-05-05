package main.design_patterns.strategy;

public class Runner {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        //Make tests with all the options
        paymentContext.setPaymentStrategy(new BizumPayment());
        paymentContext.pay();
    }
}
