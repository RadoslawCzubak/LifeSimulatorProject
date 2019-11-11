package OrganismsAbstract;

import java.awt.Image;
/**
 * Interfejs dla klasy Organism
 * @author Rados�aw Czubak
 *
 */
public interface IOrganism
{
	/**
	 * 
	 * @return zwraca obraz(ikona obiektu)
	 */
	Image getIcon();
	/**
	 * 
	 * @param iconName nazwa ikony w src/main/resources
	 */
	public void setIcon(String iconName);
	/**
	 * 
	 * @return zwraca wsp�rz�dn� X
	 */
	int getX();
	/**
	 * 
	 * @param x wsp�rz�dna X
	 */
	void setX(int x);
	/**
	 * 
	 * @return wsp�rz�dna Y
	 */
	int getY();
	/**
	 * 
	 * @param y ustawia wsp�rz�dn� Y
	 */
	void setY(int y);
	/**
	 * 
	 * @return zwraca true, je�eli uczestniczy w kolizji w przeciwnym razie false
	 */
	boolean ifCollide();
	/**
	 * Ustawia flag� kolizji
	 * @param c true, jak kolizja, w przeciwnym przypadku false
	 */
	void collision(boolean c);
	
	/**
	 * Zmienia "widzialno��" obiektu
	 * @param a true - widzialny, false - niewidzialny
	 */
	void setVisible(boolean a);
	
	/**
	 * 
	 * @return true je�li widzialny, w przeciwnym razie false.
	 */
	boolean isVisible();
	
}
