package by.alex.itcourses.entity.flower;

import by.alex.itcourses.util.LevelOfFreshness;

public class ArtificialFlower extends Flower {
	
	private String material;
	
	

	public ArtificialFlower(int size, LevelOfFreshness level, double price, String material) {
		super(size, level, price);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "ArtificialFlower material=" + material + " "+ super.toString();
	}
	
	
}
