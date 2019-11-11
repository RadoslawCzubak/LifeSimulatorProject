package Organisms;

import OrganismsAbstract.Plant;

/**
 * Precyzuje statystyki dla gatunku Flower
 * @author Rados�aw Czubak
 *
 */
public class Flower extends Plant{


	private static final long serialVersionUID = 1L;

	/**
	 * Tworzy instancj� klasy
	 * @param x wsp�rz�dna X
	 * @param y wsp�rz�dna Y 
	 */
	public Flower(int x, int y) {
		super("Flower.png", x, y, 4000,10);
	}

}
