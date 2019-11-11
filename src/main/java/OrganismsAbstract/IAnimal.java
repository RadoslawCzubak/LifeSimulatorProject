package OrganismsAbstract;
/**
 * Interfejs dla klasy Animal
 * @author Rados�aw Czubak
 * 
 *
 */
public interface IAnimal extends IOrganism, Groupable {
	
	/**
	 * Metoda zwraca szybko�� w osi X
	 * @return xSpeed
	 */
	int getxSpeed();
	/**
	 * Metoda zwraca szybko�� w osi Y
	 * @return ySpeed
	 */
	int getySpeed();
	/**
	 * Metoda zwraca kierunek ruchu w osi X
	 * @return zwraca -1, je�eli obiekt porusza si� w lewo, 1 -> w prawo
	 */
	short getxDirection();
	/**
	 * Metoda ustawia kierunek ruchu w X
	 * @param xDirection: 1 - prawo ; -1 - lewo
	 */
	void setxDirection(short xDirection);
	/**
	 * Metoda zwraca kierunek ruchu w osi Y
	 * @return zwraca -1, je�eli obiekt porusza si� w d�, 1 -> w g�r�
	 */
	short getyDirection();
	/**
	 * Metoda ustawia kierunek ruchu w X
	 * @param yDirection: 1 - g�ra ; -1 - d�
	 */
	void setyDirection(short yDirection);
	/**
	 * Metoda zmienia kierunek ruchu w X i Y na przeciwny
	 */
	void changeDirection();
	/**
	 * Metoda zwraca czy Animal jest mi�so�erny
	 * @return true je�li mi�so�erca. W przeciwnym razie false.
	 */
	boolean isPredator();
	/**
	 * @return zwraca punkty ataku
	 */
	int getAttack();
	
	/**
	 * Metoda obs�uguje funkcj� ataku poprzez zadanie obra�e� przeciwnikowi i odebraniu obra�e� od przeciwnika. Je�eli hp obiektu <=0 to ukrywa obiekt.
	 * @param opponent - przeciwnik
	 */
	void attack(IAnimal opponent);
	
	/**
	 * Sprawdza czy dany obiekt jest przedstawicielem tego samego gatunku
	 * @param org obiekt do por�wnania
	 * @return true, je�eli obeikty s� tego samego gatunku, w przeciwnym razie false.
	 */
	boolean isFriend(IAnimal org);

	/**
	 * Metoda obs�uguj�ca umiej�tno�ci specjalne
	 */
	void spell();
	
	/**
	 * Metoda pozwala na reprodukcj� gatunku
	 * @return nowy obiekt - "dziecko"
	 */
	IAnimal reproduct();
	
	/**
	 * 
	 * @return zwraca hp obiektu.
	 */
	public int getHp();
	
	/**
	 * Zwi�ksza liczb� hp o podan� w parametrze
	 * @param hp ilo�� punkt�w hp do zwi�kszenia
	 */
	public void hpUp(int hp);
	
	
}
