package OrganismsAbstract;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JComponent;

/**
 * Klasa abstrakcyjna dla organizmu przechowuj¹ca po³o¿enie, ikonê, informacje o kolizji.
 * @author Rados³aw Czubak
 *
 */

public abstract class Organism extends JComponent implements IOrganism{
	
	private static final long serialVersionUID = 1L;
	protected int x;
	protected int y;
	protected boolean collide;
	
	protected Image icon;
	/**
	 * Tworzy klasê organizm
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
	 * @return zwraca wspó³rzêdn¹ X
	 */
	public int getX()
	{
		return x;
	}
	/**
	 * Ustawia now¹ wartoœæ dla wspó³rzêdnej X
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * @return zwraca wspó³rzêdn¹ Y
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Ustawia now¹ wartoœæ dla wspó³rzêdnej Y
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
	 * Ustawia now¹ ikonê obiektu
	 */
	public void setIcon(String iconName) {
		this.icon=Toolkit.getDefaultToolkit().getImage("src/main/resources/"+iconName);
	}
	/**
	 * Metoda sprawdza czy ustawiona jest flaga collide
	 * @return true jeœli obiekt uczestniczy w kolizji, w przeciwnym wypadku false
	 */
	public boolean ifCollide()
	{
		return this.collide;
	}
	/**
	 * Metoda pozwala ustawiæ flagê kolizji
	 */
	public void collision(boolean c)
	{
		this.collide=c;
	}
	

}
