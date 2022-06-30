package lambdas.ch02.exercise;

import java.math.BigDecimal;

public class DebitCardPayment implements PaymentStrategy {
    public PaymentStatus pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " using debit card");
        return PaymentStatus.SUCCESS;
    }
}
