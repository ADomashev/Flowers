package by.alex.itcourses.entity.accessory;

public class Accessory {
	
	private double price;
	private String name;
	
	public Accessory(double price, String name) {
		this.price = price;
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Accessory price=" + price + ", name=" + name + "";
	}
	
	
	
	
}
