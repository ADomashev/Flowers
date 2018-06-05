package runapp;

import by.alex.itcourses.entity.Bouquet;
import by.alex.itcourses.entity.accessory.Packaging;
import by.alex.itcourses.entity.accessory.Ribbon;
import by.alex.itcourses.entity.flower.ArtificialFlower;
import by.alex.itcourses.entity.flower.NaturalFlower;
import by.alex.itcourses.util.BouquetUtil;
import by.alex.itcourses.util.LevelOfFreshness;

public class RunApp {

	public static void main(String[] args) {
		
		Bouquet bouquet = new Bouquet();
		
		bouquet.addFlower(new NaturalFlower(50, LevelOfFreshness.FRESH	, 100,true));
		bouquet.addFlower(new ArtificialFlower(45,LevelOfFreshness.NOT_NATURAL, 85,"plastic"));
		bouquet.addFlower(new ArtificialFlower(55,LevelOfFreshness.DRY,70,"plastic"));
		bouquet.addFlower(new NaturalFlower(38, LevelOfFreshness.MEDIUM, 68, true));
		bouquet.addFlower(new ArtificialFlower(42,LevelOfFreshness.NOT_NATURAL,70,"wooden"));
		bouquet.addFlower(new NaturalFlower(56, LevelOfFreshness.FRESH, 68, true));
		bouquet.addFlower(new ArtificialFlower(64,LevelOfFreshness.NOT_NATURAL,70,"plastic"));
		bouquet.addFlower(new NaturalFlower(30, LevelOfFreshness.MEDIUM, 68, true));
		bouquet.addAccessory(new Packaging("blue","pac",25));
		bouquet.addAccessory(new Ribbon(35, "rib", 55));
		
		BouquetUtil.printBouquet(bouquet);
		
		System.out.println();
		System.out.println("Search");
		
		BouquetUtil.searchFlower(bouquet, 36, 50);
		
		System.out.println();
		System.out.println("Sort");
		
		BouquetUtil.sortByFreshness(bouquet);
		BouquetUtil.printBouquet(bouquet);
		
		System.out.println();
		System.out.println("Full price :"+BouquetUtil.getBouquetPrice(bouquet));

	}

}
