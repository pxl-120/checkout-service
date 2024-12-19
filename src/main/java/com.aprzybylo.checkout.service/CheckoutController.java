import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {
	private Checkout checkout;
	public CheckoutController() {
		checkout = new Checkout();
		checkout.addItemToCatalog(new Item("A", 40, 3, 30));
		checkout.addItemToCatalog(new Item("B", 10, 2, 7.5));
		checkout.addItemToCatalog(new Item("C", 30, 4, 20));
		checkout.addItemToCatalog(new Item("D", 25, 2, 23.5));
	}
	@PostMapping("/scan/{itemName}")
	public String scan(@PathVariable String itemName) {
		checkout.scan(itemName);
		return "Item " + itemName + " added to cart.";
	}
	@GetMapping("/result")
	public List<ItemPrice> getResult() {
		return checkout.calculateResult();
	}
}