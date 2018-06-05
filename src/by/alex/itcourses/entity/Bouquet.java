package by.alex.itcourses.entity;

import by.alex.itcourses.entity.accessory.Accessory;
import by.alex.itcourses.entity.flower.Flower;

public class Bouquet {
	
	private Flower[] flowers;
	private Accessory[] access;
	private double price;
	
	
	public double getPrice() {
		return price;
	}

	public Flower[] getFlowers() {
		return flowers;
	}
	
	public void setFlowers(Flower[] flowers) {
		this.flowers = flowers;
	}
	
	public Accessory[] getAccess() {
		return access;
	}
	
	public void setAccess(Accessory[] access) {
		this.access = access;
	}
	
	public void addFlower (Flower flower) {
		if(getFlowers() == null) {
			setFlowers(new Flower[] {flower});
		}else {
			Flower[] tmp = new Flower[getFlowers().length+1];
			for (int i = 0; i < getFlowers().length; i++) {
				tmp[i] = getFlowers()[i];
			}tmp[tmp.length-1]=flower;
			setFlowers(tmp);
		}
	}
	
	public void addAccessory (Accessory accessory) {
		if(getAccess() == null) {
			setAccess(new Accessory[] {accessory});
		}else {
			Accessory[] tmp = new Accessory[getAccess().length+1];
			for (int i = 0; i < getAccess().length; i++) {
				tmp[i] = getAccess()[i];
			}tmp[tmp.length-1]=accessory;
			setAccess(tmp);
		}
	}
}
