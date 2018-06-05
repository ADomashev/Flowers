package by.alex.itcourses.entity.accessory;

public class Packaging extends Accessory {
	
	private String color;

	public Packaging(String color,String name,double price) {
		super(price,name);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Packaging color=" + getColor() + super.toString();
	}
	
	
	
}
