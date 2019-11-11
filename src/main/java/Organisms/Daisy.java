package Organisms;

import OrganismsAbstract.Plant;

/**
 * Precyzuje statystyki dla gatunku Daisy
 * @author Rados�aw Czubak
 *
 */
public class Daisy extends Plant{

	/**
	 * Tworzy instancj� klasy
	 * @param x wsp�rz�dna X
	 * @param y wsp�rz�dna Y 
	 */
	private static final long serialVersionUID = 1L;

	public Daisy( int x, int y) {
		super("Daisy.png", x, y, 2500,6);
	}

}
