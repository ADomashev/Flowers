package by.alex.itcourses.entity;

import by.alex.itcourses.entity.accessory.Accessory;
import by.alex.itcourses.entity.flower.Flower;

public class Bouquet {
	
	private Flower[] flowers;
	private Accessory[] access;
	
	
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

	public void addFlower (Accessory acc) {
		if(access == null) {
			this.access = new Accessory[] {acc};
		}else {
			Accessory[] tmp = new Accessory[access.length+1];
			for (int i = 0; i < access.length; i++) {
				tmp[i] = access[i];
			}tmp[tmp.length-1]=acc;
			access = tmp;
		}
	}
}
