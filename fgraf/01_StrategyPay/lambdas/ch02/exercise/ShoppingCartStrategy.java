package lambdas.ch02.exercise;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartStrategy {

	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public PaymentStatus pay(PaymentStrategy paymentStrategy) {
		BigDecimal total = getTotal();
		return paymentStrategy.pay(total);
	}

	private BigDecimal getTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (Item item : items) {
			total = total.add(item.getPrice());
		}
		return total;
	}
}
