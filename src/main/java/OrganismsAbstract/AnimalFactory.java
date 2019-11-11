package OrganismsAbstract;

import java.util.Random;
import java.util.Vector;

import Organisms.Human;
import Organisms.Llama;
import Organisms.PlaceHolder;
import Organisms.Sheep;
import Organisms.Tiger;
import Organisms.Wolf;
/**
 * Fabryka klas dziedzicz¹cych po klasie Animal
 * @author Rados³aw Czubak
 * @see Class Animal
 *
 */
public class AnimalFactory implements IAnimalFactory 
{
	private Random rnd;
	private Vector<Integer> xCord;
	private Vector<Integer> yCord;
	private int distance;
	
	/**
	 * Tworzy instancjê klasy.
	 */
	public AnimalFactory()
	{
		xCord=new Vector<Integer>();
		yCord=new Vector<Integer>();
		rnd= new Random();
		distance=50;
	}
	
	@Override
	public IAnimal createRandomAnimal(String choice)
	{
        int x=0,y=0;
		
		for(int i=1; i>0; i++)
		{
			int checked=0;
			x=rnd.nextInt(24);
			y=rnd.nextInt(13);
			for(int j=0;j<xCord.size();j++)
			{
				if( x!=xCord.get(j) || y!=yCord.get(j) ) checked++;
			}
			if(checked==xCord.size())
				break;
		}
		
		return createAnimal(choice, x*distance+x,y*distance+y);
		
	}
	
	@Override
	public IAnimal createAnimal(String choice, int x, int y)
	{
		
		boolean xDir=rnd.nextBoolean();
		boolean yDir=rnd.nextBoolean();
		
		Animal.visibleAnimals++;
		Animal.livedAnimals++;
		switch(choice)
		{
		case "Sheep":
			return new Sheep(x,y, xDir ? 1:-1,yDir ? 1:-1);
		case "Human":
			return new Human(x,y, xDir ? 1:-1,yDir ? 1:-1);
		case "Wolf":
			return new Wolf(x,y, xDir ? 1:-1,yDir ? 1:-1);
		case "Llama":
			return new Llama(x,y, xDir ? 1:-1,yDir ? 1:-1);
		case "Tiger":
			return new Tiger(x,y, xDir ? 1:-1,yDir ? 1:-1);
		default:
			return new PlaceHolder(x,y, xDir ? 1:-1,yDir ? 1:-1);
		
		}
		
	}
}
