package lambdas.ch02.exercise;

import java.math.BigDecimal;

public interface PaymentStrategy {
    public PaymentStatus pay(BigDecimal amount);
}