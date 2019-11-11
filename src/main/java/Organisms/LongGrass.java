package Organisms;

import OrganismsAbstract.Plant;

/**
 * Precyzuje statystyki dla gatunku LongGrass
 * @author Rados�aw Czubak
 *
 */
public class LongGrass extends Plant{

	/**
	 * Tworzy instancj� klasy
	 * @param x wsp�rz�dna X
	 * @param y wsp�rz�dna Y 
	 */
	private static final long serialVersionUID = 1L;

	public LongGrass(int x, int y) {
		super("grass.png", x, y, 1500,12);
	}

}
