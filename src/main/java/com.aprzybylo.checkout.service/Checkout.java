import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Checkout {
	private Map<String, Integer> cart = new HashMap<>();
	private Map<String, Item> itemCatalog = new HashMap<>();
	public void scan(String itemName) {
		cart.put(itemName, cart.getOrDefault(itemName, 0) + 1);
	}
	public List<ItemPrice> calculateResult() {
		ArrayList<ItemPrice> result = new ArrayList<>();
		for (String itemName : cart.keySet()) {
			Item item = itemCatalog.get(itemName);
			int quantity = cart.get(itemName);
			result.add(new ItemPrice(itemName, quantity, quantity >= item.getRequiredQuantity()
				? item.getSpecialPrice() * quantity
				: item.getNormalPrice() * quantity));
		}
		return result;
		/*double total = 0;
		for (String itemName : cart.keySet()) {
			Item item = itemCatalog.get(itemName);
			int quantity = cart.get(itemName);
			if (quantity >= item.getRequiredQuantity()) {
				total += (quantity / item.getRequiredQuantity()) * item.getSpecialPrice();
				total += (quantity % item.getRequiredQuantity()) * item.getNormalPrice();
			} else {
				total += quantity * item.getNormalPrice();
			}
		}
		return total;*/
	}
	public void addItemToCatalog(Item item) {
		itemCatalog.put(item.getName(), item);
	}
}