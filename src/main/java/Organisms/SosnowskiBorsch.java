package Organisms;

import OrganismsAbstract.Plant;

/**
 * Precyzuje statystyki dla gatunku SosnowskiBorsch
 * @author Rados³aw Czubak
 *
 */
public class SosnowskiBorsch extends Plant{

	private static final long serialVersionUID = 1L;
	/**
	 * Tworzy instancjê klasy
	 * @param x wspó³rzêdna X
	 * @param y wspó³rzêdna Y 
	 */
	public SosnowskiBorsch(int x, int y) 
	{
		super("Sosnowski.png",x, y, 1800,8);
	}

}
