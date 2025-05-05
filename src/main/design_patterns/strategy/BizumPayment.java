package main.design_patterns.strategy;

public class BizumPayment implements IPaymentStrategy {

    @Override
    public void getPaymentDetails() {
        System.out.println("Bizum payment dummy");
    }
}
