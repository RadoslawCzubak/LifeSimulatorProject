package Organisms;

import java.util.Random;

import LifeSimulation.SimulationDisplay;
import OrganismsAbstract.Animal;
import OrganismsAbstract.IAnimal;

/**
 *Klasa Human odpowiada za sprecyzowanie statystyk postaci Human
 * 
 * Cechy: 
 * Ikona: L: Human.png R: Human.png   
 * Mi�so�erny: NIE   
 * Szybko�� ruchu w pionie: 1   
 * Szybko�� ruchu w poziomie: 1   
 * Punkty ataku: 5   
 * Punkty �ycia: 10
 * Specjalna umiej�tno��:
 * Po ataku mo�e dosta� z prawdopodobie�stwem 1/50 dodatkowy punkt �ycia.
 * 
 * 
 * @author Rados�aw Czubak
 * @version 1.0.0
 * 
 */


public class Human extends Animal
{

	private static final long serialVersionUID = 1L;
	
	private boolean specialAbility; private Random rnd;
	
	/**
	 * Konstruktor Human
	 * @param x wsp�rz�dna X
	 * @param y wsp�rz�dna Y
	 * @param xDirection kierunek na osi X
	 * @param yDirection kierunek na osi Y
	 */
	public Human(int x, int y, int xDirection, int yDirection)
	{
		super("Human.png", x, y,(short) xDirection, (short)yDirection, 1, 1, false, 5, 10);
		specialAbility=false;
		rnd=new Random();
	}
	
	@Override
	public void attack(IAnimal opponent)
	{
		if(!(opponent instanceof Human)) {
		System.out.println("false");
		this.hp -= opponent.getAttack();
		}
		specialAbility=true;
		if (this.hp<=0) {
			setVisible(false);	Animal.visibleAnimals--;
		}
	}

	@Override
	public boolean isFriend(IAnimal org) {
		if(org instanceof Human) return true;
		else return false;
	}
	
	@Override
	public IAnimal reproduct()
	{
		return SimulationDisplay.aFactory.createAnimal("Human", group.chef.getX(), group.chef.getY());
	}
	
	@Override
	public void spell()
	{
		if(specialAbility==true)
		{	
			int chance =rnd.nextInt(50);
			if(chance==1) hp++;
			specialAbility=false;
		}
	}
	
	
}
