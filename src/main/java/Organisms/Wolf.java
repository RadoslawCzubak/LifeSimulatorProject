package Organisms;

import LifeSimulation.SimulationDisplay;
import OrganismsAbstract.Animal;
import OrganismsAbstract.IAnimal;

/**
 * Klasa Wolf odpowiada za sprecyzowanie statystyk postaci Wolf
 * 
 * Cechy: 
 * Ikona: L: WolfL.png R: WolfR.png
 * Miêso¿erny: TAK
 * Szybkoœæ ruchu w pionie: 1
 * Szybkoœæ ruchu w poziomie: 1
 * Punkty ataku: 6
 * Punkty ¿ycia: 10
 * Specjalna umiejêtnoœæ:
 * Po ataku przez 2 sekundy punkty ataku licz¹ siê x2
 * 
 * @author Rados³aw Czubak
 * @version 1.0.0
 * 
 */

public class Wolf extends Animal
{
	
	private static final long serialVersionUID = 1L;
	
	private int spAbTime; private boolean specialAbility;
	
	/**
	 * 
	 * @param x wspó³rzêdna X
	 * @param y wspó³rzêdna Y
	 * @param xDirection kierunek na osi X
	 * @param yDirection kierunek na osi Y
	 * 
	 */
	public Wolf(int x, int y, int xDirection, int yDirection)
	{
		super("WolfL.png", "WolfR.png", x, y,(short) xDirection, (short)yDirection, 1, 1, true, 6, 10);
		spAbTime=0;
		specialAbility=false;
	}
	
	/**
	 * Metoda odpowiada za wymianê ataku pomiêdzy obiektami, które siê spotkaj¹
	 * @param opponent -- obiekt, z którym dochodzi do wymiany ataku
	 * Obiekt pobiera punkty ataku "opponent" i odejmuje je od swoich punktów hp
	 * nastêpnie ustawia sobie czas spAbTime
	 */
	public void attack(IAnimal opponent)
	{
		if(!isFriend(opponent)) {
		System.out.println("false");
		this.hp -= opponent.getAttack();
		}
		spAbTime=2000;
		if (this.hp<=0) {
			setVisible(false); Animal.visibleAnimals--;
		}
		
		
	}
	
	@Override
	public boolean isFriend(IAnimal org) {
		if(org instanceof Wolf) return true;
		else return false;
	}
	
	/**
	 * Metoda obs³uguj¹ca umiejêtnoœæ specjaln¹
	 * Sprawdza czy czas US jest >0
	 * je¿eli tak ustawia flagê specialAbility na true i mno¿y attackPoint x2
	 * Gdy czas <0 i specialAbility true 
	 */
	@Override
	public void spell()
	{
		if(spAbTime>0 && this.specialAbility==false)
		{
			this.specialAbility=true;
			this.attackPoint*=2;
		}
		else if(this.specialAbility==true)
		{
			this.spAbTime-=25;
			if(spAbTime<0)
			{
				this.attackPoint/=2;
				this.specialAbility=false;
			}
		}
	}
	
	/**
	 * Metoda odpowiada za rozmna¿anie siê gatunku
	 * @return zwraca nowy obiekt tej samej klasy 
	 */
	public IAnimal reproduct()
	{
		System.out.println("Wolf reproduction");
		return SimulationDisplay.aFactory.createAnimal("Wolf", group.chef.getX(), group.chef.getY());
	}
}
