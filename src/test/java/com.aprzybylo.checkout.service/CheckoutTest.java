import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class CheckoutTest {
	@Test
	public void testCalculateTotal() {
		Checkout checkout = new Checkout();
		checkout.addItemToCatalog(new Item("A", 40, 3, 30));
		checkout.scan("A");
		checkout.scan("A");
		checkout.scan("A");
		List<ItemPrice> result = checkout.calculateResult();
		assertEquals(1, result.size());
		assertEquals(3, result.get(0).getQuantity());
		assertEquals(90, result.get(0).getPrice());
	}
}