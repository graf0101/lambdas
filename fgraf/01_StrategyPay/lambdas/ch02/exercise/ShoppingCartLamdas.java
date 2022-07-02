package lambdas.ch02.exercise;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class ShoppingCartLamdas {

	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public PaymentStatus pay(Function<BigDecimal, PaymentStatus> payment) {
		Objects.requireNonNull(payment);
		BigDecimal total = getTotal();		
		return payment.apply(total);
	}

	private BigDecimal getTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (Item item : items) {
			total = total.add(item.getPrice());
		}
		return total;
	}
}
