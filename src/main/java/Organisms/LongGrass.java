package Organisms;

import OrganismsAbstract.Plant;

/**
 * Precyzuje statystyki dla gatunku LongGrass
 * @author Rados³aw Czubak
 *
 */
public class LongGrass extends Plant{

	/**
	 * Tworzy instancjê klasy
	 * @param x wspó³rzêdna X
	 * @param y wspó³rzêdna Y 
	 */
	private static final long serialVersionUID = 1L;

	public LongGrass(int x, int y) {
		super("grass.png", x, y, 1500,12);
	}

}
