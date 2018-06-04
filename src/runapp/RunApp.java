package runapp;

import by.alex.itcourses.entity.Bouquet;
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
		BouquetUtil.printBouquet(bouquet);
		
		System.out.println("search");
		BouquetUtil.searchFlower(bouquet, 36, 50);
		
		System.out.println("sort");
		BouquetUtil.sortByFreshness(bouquet);
		BouquetUtil.printBouquet(bouquet);

	}

}
