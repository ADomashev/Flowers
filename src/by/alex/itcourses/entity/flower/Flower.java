package by.alex.itcourses.entity.flower;

import by.alex.itcourses.util.LevelOfFreshness;

public class Flower {
	
	private int size;
	private LevelOfFreshness level;
	private double price;
	
	
	public Flower(int size, LevelOfFreshness level, double price) {
		this.size = size;
		this.level = level;
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public LevelOfFreshness getLevel() {
		return level;
	}
	public void setLevel(LevelOfFreshness level) {
		this.level = level;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "size=" + size + ", level=" + level + ", price=" + price + "";
	}
	
	
	
}
