package OrganismsAbstract;
/**
 * Interfejs dla klasy Animal
 * @author Rados³aw Czubak
 * 
 *
 */
public interface IAnimal extends IOrganism, Groupable {
	
	/**
	 * Metoda zwraca szybkoœæ w osi X
	 * @return xSpeed
	 */
	int getxSpeed();
	/**
	 * Metoda zwraca szybkoœæ w osi Y
	 * @return ySpeed
	 */
	int getySpeed();
	/**
	 * Metoda zwraca kierunek ruchu w osi X
	 * @return zwraca -1, je¿eli obiekt porusza siê w lewo, 1 -> w prawo
	 */
	short getxDirection();
	/**
	 * Metoda ustawia kierunek ruchu w X
	 * @param xDirection: 1 - prawo ; -1 - lewo
	 */
	void setxDirection(short xDirection);
	/**
	 * Metoda zwraca kierunek ruchu w osi Y
	 * @return zwraca -1, je¿eli obiekt porusza siê w dó³, 1 -> w górê
	 */
	short getyDirection();
	/**
	 * Metoda ustawia kierunek ruchu w X
	 * @param yDirection: 1 - góra ; -1 - dó³
	 */
	void setyDirection(short yDirection);
	/**
	 * Metoda zmienia kierunek ruchu w X i Y na przeciwny
	 */
	void changeDirection();
	/**
	 * Metoda zwraca czy Animal jest miêso¿erny
	 * @return true jeœli miêso¿erca. W przeciwnym razie false.
	 */
	boolean isPredator();
	/**
	 * @return zwraca punkty ataku
	 */
	int getAttack();
	
	/**
	 * Metoda obs³uguje funkcjê ataku poprzez zadanie obra¿eñ przeciwnikowi i odebraniu obra¿eñ od przeciwnika. Je¿eli hp obiektu <=0 to ukrywa obiekt.
	 * @param opponent - przeciwnik
	 */
	void attack(IAnimal opponent);
	
	/**
	 * Sprawdza czy dany obiekt jest przedstawicielem tego samego gatunku
	 * @param org obiekt do porównania
	 * @return true, je¿eli obeikty s¹ tego samego gatunku, w przeciwnym razie false.
	 */
	boolean isFriend(IAnimal org);

	/**
	 * Metoda obs³uguj¹ca umiejêtnoœci specjalne
	 */
	void spell();
	
	/**
	 * Metoda pozwala na reprodukcjê gatunku
	 * @return nowy obiekt - "dziecko"
	 */
	IAnimal reproduct();
	
	/**
	 * 
	 * @return zwraca hp obiektu.
	 */
	public int getHp();
	
	/**
	 * Zwiêksza liczbê hp o podan¹ w parametrze
	 * @param hp iloœæ punktów hp do zwiêkszenia
	 */
	public void hpUp(int hp);
	
	
}
