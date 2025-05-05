package main.design_patterns.strategy;

public class PaymentContext {

    private IPaymentStrategy paymentStrategy;

    public void setPaymentStrategy(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
        //Bad practices?
        this.paymentStrategy.getPaymentDetails();
    }

    public void pay() {
        System.out.println("Paying through " + this.paymentStrategy.getClass().getSimpleName());
    }
}
