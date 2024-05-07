package ncs4.test2;

public class Fruit {
	String name;
	int price;
	int quantity;
	
	 public Fruit() {
	}
	
	public Fruit(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
