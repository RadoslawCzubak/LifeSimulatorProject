package Organisms;

import OrganismsAbstract.Plant;

/**
 * Precyzuje statystyki dla gatunku SosnowskiBorsch
 * @author Rados�aw Czubak
 *
 */
public class SosnowskiBorsch extends Plant{

	private static final long serialVersionUID = 1L;
	/**
	 * Tworzy instancj� klasy
	 * @param x wsp�rz�dna X
	 * @param y wsp�rz�dna Y 
	 */
	public SosnowskiBorsch(int x, int y) 
	{
		super("Sosnowski.png",x, y, 1800,8);
	}

}
