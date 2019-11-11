package Organisms;

import OrganismsAbstract.Plant;

/**
 * Precyzuje statystyki dla gatunku Daisy
 * @author Rados³aw Czubak
 *
 */
public class Daisy extends Plant{

	/**
	 * Tworzy instancjê klasy
	 * @param x wspó³rzêdna X
	 * @param y wspó³rzêdna Y 
	 */
	private static final long serialVersionUID = 1L;

	public Daisy( int x, int y) {
		super("Daisy.png", x, y, 2500,6);
	}

}
