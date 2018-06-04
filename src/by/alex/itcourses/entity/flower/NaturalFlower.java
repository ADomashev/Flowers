package by.alex.itcourses.entity.flower;

import by.alex.itcourses.util.LevelOfFreshness;

public class NaturalFlower extends Flower{
	
	private boolean inPot;
	
	public NaturalFlower(int size, LevelOfFreshness level, double price,boolean inPot) {
		super(size, level, price);
		this.inPot=inPot;
	}

	public boolean getInPot() {
		return inPot;
	}

	public void setInPot(boolean life) {
		this.inPot = life;
	}

	@Override
	public String toString() {
		return "NaturalFlower life=" + getInPot() + " "+ super.toString();
	}
	
	
}
