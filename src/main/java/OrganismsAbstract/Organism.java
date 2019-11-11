package OrganismsAbstract;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JComponent;

/**
 * Klasa abstrakcyjna dla organizmu przechowuj�ca po�o�enie, ikon�, informacje o kolizji.
 * @author Rados�aw Czubak
 *
 */

public abstract class Organism extends JComponent implements IOrganism{
	
	private static final long serialVersionUID = 1L;
	protected int x;
	protected int y;
	protected boolean collide;
	
	protected Image icon;
	/**
	 * Tworzy klas� organizm
	 * @param x wspolrzedna X
	 * @param y wspolrzedna Y
	 * @param iconName nazwa obrazu w src/main/resources/iconName
	 */
	public Organism(int x, int y, String iconName)
	{
		this.x=x;
		this.y=y;
		
		this.icon=Toolkit.getDefaultToolkit().getImage("src/main/resources/"+iconName);
	}
	/**
	 * @return zwraca wsp�rz�dn� X
	 */
	public int getX()
	{
		return x;
	}
	/**
	 * Ustawia now� warto�� dla wsp�rz�dnej X
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * @return zwraca wsp�rz�dn� Y
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Ustawia now� warto�� dla wsp�rz�dnej Y
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * @return Ikona obiektu
	 */
	public Image getIcon() {
		return this.icon;
	}
	/**
	 * Ustawia now� ikon� obiektu
	 */
	public void setIcon(String iconName) {
		this.icon=Toolkit.getDefaultToolkit().getImage("src/main/resources/"+iconName);
	}
	/**
	 * Metoda sprawdza czy ustawiona jest flaga collide
	 * @return true je�li obiekt uczestniczy w kolizji, w przeciwnym wypadku false
	 */
	public boolean ifCollide()
	{
		return this.collide;
	}
	/**
	 * Metoda pozwala ustawi� flag� kolizji
	 */
	public void collision(boolean c)
	{
		this.collide=c;
	}
	

}
