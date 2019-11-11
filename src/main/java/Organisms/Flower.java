package Organisms;

import OrganismsAbstract.Plant;

/**
 * Precyzuje statystyki dla gatunku Flower
 * @author Rados³aw Czubak
 *
 */
public class Flower extends Plant{


	private static final long serialVersionUID = 1L;

	/**
	 * Tworzy instancjê klasy
	 * @param x wspó³rzêdna X
	 * @param y wspó³rzêdna Y 
	 */
	public Flower(int x, int y) {
		super("Flower.png", x, y, 4000,10);
	}

}
