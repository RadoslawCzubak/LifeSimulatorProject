package OrganismsAbstract;

import java.awt.Image;
/**
 * Interfejs dla klasy Organism
 * @author Rados³aw Czubak
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
	 * @return zwraca wspó³rzêdn¹ X
	 */
	int getX();
	/**
	 * 
	 * @param x wspó³rzêdna X
	 */
	void setX(int x);
	/**
	 * 
	 * @return wspó³rzêdna Y
	 */
	int getY();
	/**
	 * 
	 * @param y ustawia wspó³rzêdn¹ Y
	 */
	void setY(int y);
	/**
	 * 
	 * @return zwraca true, je¿eli uczestniczy w kolizji w przeciwnym razie false
	 */
	boolean ifCollide();
	/**
	 * Ustawia flagê kolizji
	 * @param c true, jak kolizja, w przeciwnym przypadku false
	 */
	void collision(boolean c);
	
	/**
	 * Zmienia "widzialnoœæ" obiektu
	 * @param a true - widzialny, false - niewidzialny
	 */
	void setVisible(boolean a);
	
	/**
	 * 
	 * @return true jeœli widzialny, w przeciwnym razie false.
	 */
	boolean isVisible();
	
}
