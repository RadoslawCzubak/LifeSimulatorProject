package OrganismsAbstract;

import java.util.Vector;

import LifeSimulation.SimulationFrame;
/**
 * Klasa przechowuj�ca informacje o grupie, jej cz�onkach, liderze. 
 * @author Rados�aw Czubak
 * 
 *
 */
public class Group {
	public Vector<IAnimal> members;
	public IAnimal chef;
	public int x;
	public int y;
	public int size = 150;
	public int repTime;
	public static int REP_TIME=6000;
	
	/**
	 * Tworzy grup� z dw�ch przedstawicieli jednego gatunku.
	 * @param a1 pierwszy cz�onek grupy
	 * @param a2 drugi cz�onek grupy
	 */
	public Group(IAnimal a1, IAnimal a2)
	{
		members=new Vector<IAnimal>(1);
		chef = a1;
		members.add(a1);
		members.add(a2);
		this.x = a1.getX()-size/2;
		this.y = a1.getY()-size/2;
		repTime=REP_TIME;
		
	}
	
	/**
	 * Aktualizuje obszar wyst�powania cz�onk�w grupy w zale�no�ci od pozycji lidera
	 */
	public void reCoord()
	{
	
		this.x = chef.getX() - size/2;
		this.y = chef.getY() - size/2;
		repTime= repTime - SimulationFrame.TIME_RES;
	}
	
	/**
	 * Pozwala doda� cz�onka do istniej�cej grupy
	 * @param a nowy cz�onek
	 */
	public void addMember(IAnimal a)
	{
		if(chef.isFriend(a)) members.add(a);
	}
	
	/**
	 * Sprawdza czy grupa mo�e si� rozmno�y�. Por�wnuje czy czas od poprzedniego rozmno�enia jest <= 0
	 * @return true je�li grupa mo�e si� rozmno�y�, w przeciwnym wypadku false.
	 */
	public boolean isPregnant()
	{
		int visible=0;
		for(int i=0;i<members.size();i++)
		{	
			
			if(members.get(i).isVisible())
				visible++;
			
			
		}
		if(repTime<0 && visible>=2 && visible<15) return true;	
		return false;
			
	}
	/**
	 * Metoda odpowiadaj�ca za rozmna�anie si� stada. Tworzy cz�onka o takiej samej klasie jak lider grupy.
	 * @return nowy cz�onek grupy - "dziecko"
	 */
	public IAnimal getChild()
	{
		repTime=REP_TIME;
		if(!chef.isPredator()) repTime-=2000;
		return chef.reproduct();
	}
}
