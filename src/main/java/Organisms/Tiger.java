package Organisms;

import java.util.Random;

import LifeSimulation.SimulationDisplay;
import OrganismsAbstract.Animal;
import OrganismsAbstract.IAnimal;

/**
 * 
 * Klasa Tiger odpowiada za sprecyzowanie statystyk postaci Tiger
 * Cechy: 
 * Ikona: L: TigerL.png R: TigerR.png
 * Miêso¿erny: TAK
 * Szybkoœæ ruchu w pionie: 1
 * Szybkoœæ ruchu w poziomie: 1
 * Punkty ataku: 5
 * Punkty ¿ycia: 11
 * Specjalna umiejêtnoœæ:
 * Po ataku z prawdopodobieñstwem 1/20 mo¿e dostaæ +1 do punktów ataku.
 * 
 * 
 * @author Rados³aw Czubak
 * @version 1.0.0
 */
public class Tiger extends Animal{


	private static final long serialVersionUID = 1L;
	private boolean specialAbility;
	Random rnd;
	
	/**
	 * Tworzy instancjê klasy
	 * @param x wspó³rzêdna X
	 * @param y wspó³rzêdna Y
	 * @param xDirection kierunek ruchu w osi X
	 * @param yDirection kierunek ruchu w osi Y
	 */
	public Tiger(int x, int y, int xDirection, int yDirection) {
		super("TigerL.png", "TigerR.png", x, y,(short) xDirection,(short) yDirection, 1, 1, true, 5, 11);
		specialAbility=false;
		rnd=new Random();
	}

	@Override
	public void attack(IAnimal opponent)
	{
		if(!(this.isFriend(opponent))) {
		System.out.println("false");
		this.hp -= opponent.getAttack();
		}
		specialAbility=true;
		if (this.hp<=0) setVisible(false);
		
	}

	@Override
	public boolean isFriend(IAnimal org) {
		if(org instanceof Tiger) return true;
		else return false;
	}
	public void spell()
	{
		if(specialAbility==true)
		{
			int chance = rnd.nextInt(20);	
			if(chance == 1)  attackPoint++;

			specialAbility=false;
		}
		
	}
	@Override
	public IAnimal reproduct()
	{
		System.out.println("Tiger reproduction");
		return SimulationDisplay.aFactory.createAnimal("Tiger", group.chef.getX(), group.chef.getY());
	}
}
