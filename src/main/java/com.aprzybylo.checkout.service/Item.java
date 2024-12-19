public class Item {
	private String name;
	private double normalPrice;
	private int requiredQuantity;
	private double specialPrice;
	public Item(String name, double normalPrice, int requiredQuantity, double specialPrice) {
		this.name = name;
		this.normalPrice = normalPrice;
		this.requiredQuantity = requiredQuantity;
		this.specialPrice = specialPrice;
	}
	public String getName() {
		return name;
	}
	public double getNormalPrice() {
		return normalPrice;
	}
	public int getRequiredQuantity() {
		return requiredQuantity;
	}
	public double getSpecialPrice() {
		return specialPrice;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNormalPrice(double normalPrice) {
		this.normalPrice = normalPrice;
	}
	public void setRequiredQuantity(int requiredQuantity) {
		this.requiredQuantity = requiredQuantity;
	}
	public void setSpecialPrice(double specialPrice) {
		this.specialPrice = specialPrice;
	}
}