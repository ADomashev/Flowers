package by.alex.itcourses.entity.flower;

import by.alex.itcourses.util.LevelOfFreshness;

public class NaturalFlower extends Flower{
	
	private boolean life;
	
	public NaturalFlower(int size, LevelOfFreshness level, double price,boolean life) {
		super(size, level, price);
		this.life=life;
	}

	public boolean isLife() {
		return life;
	}

	public void setLife(boolean life) {
		this.life = life;
	}
	
	
}
