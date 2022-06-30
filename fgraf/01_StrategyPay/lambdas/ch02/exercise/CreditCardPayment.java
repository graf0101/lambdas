package lambdas.ch02.exercise;

import java.math.BigDecimal;

public class CreditCardPayment implements PaymentStrategy {
    public PaymentStatus pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " using credit card");
        return PaymentStatus.SUCCESS;
    }
}
