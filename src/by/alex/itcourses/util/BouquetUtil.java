package by.alex.itcourses.util;

import by.alex.itcourses.entity.Bouquet;
import by.alex.itcourses.entity.flower.Flower;

public class BouquetUtil {
	
	public static void printBouquet(Bouquet bouquet) {
		if(bouquet.getFlowers()!=null) {
			for (int i = 0; i < bouquet.getFlowers().length; i++) {
				System.out.println(bouquet.getFlowers()[i].toString());
			}
		}if(bouquet.getAccess()!=null) {
			for (int i = 0; i < bouquet.getAccess().length; i++) {
				System.out.println(bouquet.getAccess()[i].toString());
			}
		}
	}
	
	public	static void searchFlower (Bouquet bouquet,int flowerLenghtMin,int flowerLenghtMax) {
		if(bouquet.getFlowers()!=null) {
			for (int i = 0; i < bouquet.getFlowers().length; i++) {
				if(flowerLenghtMax>=bouquet.getFlowers()[i].getSize() && bouquet.getFlowers()[i].getSize()>=flowerLenghtMin)
				System.out.println(bouquet.getFlowers()[i].toString());
			}
		}
	}
	public static void sortByFreshness(Bouquet bouquet) {
		if(bouquet.getFlowers()!=null) {
			quicksort(bouquet.getFlowers(),(bouquet.getFlowers().length-bouquet.getFlowers().length),bouquet.getFlowers().length-1);
		}
	}
	
	
	private static void quicksort(Flower [] arr,int first,int last) {
		Flower temp;
		int firstElem = first;
		int lastElem = last;
		int middle = arr[firstElem+(lastElem-firstElem)/2].getLevel().ordinal();
		do {
			while(arr[firstElem].getLevel().ordinal()<middle) {++firstElem;}
			while(arr[lastElem].getLevel().ordinal()>middle) {--lastElem;}
			if(firstElem<=lastElem) {
				temp=arr[firstElem];
				arr[firstElem]=arr[lastElem];
				arr[lastElem]=temp;
				firstElem++;
				lastElem--;
			}
		}while(firstElem<=lastElem);
		if(first<lastElem) {quicksort(arr,first,lastElem);}
		if(firstElem<last) {quicksort(arr,firstElem,last);}
		
	}
	public static double getBouquetPrice(Bouquet bouquet) {
		double result=0;
			for (int i = 0; i < bouquet.getFlowers().length; i++) {
				result+=bouquet.getFlowers()[i].getPrice();
			}for (int i = 0; i < bouquet.getAccess().length; i++) {
				result+=bouquet.getAccess()[i].getPrice();
			}
		return result;
		
	} 
}
