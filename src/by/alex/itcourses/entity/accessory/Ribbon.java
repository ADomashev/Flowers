package by.alex.itcourses.entity.accessory;

public class Ribbon extends Accessory{
	private int longRibbon;

	public Ribbon(double price, String name, int longRibbon) {
		super(price, name);
		this.longRibbon = longRibbon;
	}

	public int getLongRibbon() {
		return longRibbon;
	}

	public void setLongRibbon(int longRibbon) {
		this.longRibbon = longRibbon;
	}

	@Override
	public String toString() {
		return "Ribbon longRibbon=" + getLongRibbon() + super.toString();
	}	
}
