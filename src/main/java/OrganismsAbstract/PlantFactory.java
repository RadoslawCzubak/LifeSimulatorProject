package OrganismsAbstract;

import java.util.Random;

import Organisms.Daisy;
import Organisms.Flower;
import Organisms.LongGrass;
import Organisms.SosnowskiBorsch;
/**
 * Fabryka klas dziedzicz¹cych po klasie Plant
 * @author Rados³aw Czubak
 * @see Plant
 */
public class PlantFactory implements IPlantFactory
{
	private Random rnd;
	/**
	 * Tworzy instancjê PlantFactory
	 */
	public PlantFactory()
	{
		rnd=new Random();
	}
	
	@Override
	public IPlant createNewPlant(String choice, int x, int y) {
		
		Plant.livedPlants++;
		Plant.visiblePlants++;
		
		
		switch(choice)
		{
		case "Daisy":
			return new Daisy(x,y);
		
		case "Flower":
			return new Flower(x,y);
			
		case "LongGrass":
			return new LongGrass(x,y);
		
		case "SosnowskiBorsch":
			return new SosnowskiBorsch(x,y);
			
		default:
			return new SosnowskiBorsch(x,y);
		}
	}
	
	public IPlant createRandomPlant(String choice)
	{
		return createNewPlant(choice, rnd.nextInt(1230), rnd.nextInt(670));
	}
	
	public IPlant createNewChild(IPlant plant, int x, int y)
	{
		String choice="default";
		if(x>1280) x-=2*(x-1280); else if(x<0)x*=-1;
		if(y>720) y-=2*(y-720); else if(y<0)y*=-1;
		
		if(plant instanceof SosnowskiBorsch) choice="SosnowskiBorsch";
		else if(plant instanceof Flower) choice = "Flower";
		else if(plant instanceof Daisy) choice = "Daisy";
		else if(plant instanceof LongGrass) choice = "LongGrass";
		System.out.println(x +" "+y);
		return createNewPlant(choice, x, y);
	}
	
}
