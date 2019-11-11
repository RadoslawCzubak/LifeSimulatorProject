package OrganismsAbstract;

/**
 *  *	Klasa abstrakcyjna Animal, przechowuje informacje o: 
 * kierunku ruchu,   
 * pr�dko�ci,   
 * punktach �ycia,  
 * czy mi�so�erny,  
 * przechowuje fabryk� AnimalFactory  
 * 
 * @author Rados�aw Czubak
 *
 */

public abstract class Animal extends Organism implements IAnimal, Groupable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String leftImage;
	String rightImage;
	
	protected short xDirection;
	protected short yDirection;
	protected int xSpeed;
	protected int ySpeed;
	protected int hp;
	protected int attackPoint;
	protected boolean predator;
	public static int visibleAnimals=0;
	public static int livedAnimals=0;
	
	
	protected Group group;
	
	/**
	 * Konstruktor klasy animal. Tworzy obiekt
	 * 
	 * @param leftImage Ikona dla obiektu poruszaj�cego si� w lewo
	 * @param rightImage Ikona dla obiektu poruszaj�cego si� w prawo
	 * @param x wsp�rz�dna X
	 * @param y wsp�rz�dna Y
	 * @param xDirection kierunek ruchu w osi X
	 * @param yDirection kierunek ruchu w osi Y 
	 * @param xSpeed szybko�� ruchu na osi X
	 * @param ySpeed szybko�� ruchu na osi Y
	 * @param predator czy mi�so�erny, true je�li tak, w przeciwnym wypadku false
	 * @param attack ilo�� punkt�w ataku
	 * @param hp ilo�� punkt�w �ycia
	 */
	
	public Animal(String leftImage, String rightImage, int x, int y, short xDirection, short yDirection, int xSpeed, int ySpeed, boolean predator, int attack, int hp)
	{
		super(x, y, rightImage);
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
		this.xDirection=xDirection;
		this.yDirection=yDirection;
		this.predator=predator;
		this.attackPoint=attack;
		this.hp=hp;
		this.leftImage=leftImage;
		this.rightImage=rightImage;
	}
	
	/** 
	 * Konstruktor dla obiekt�w animal z pojedyncz� ikon�. Tworzy obiekt
	 * @param rightImage Ikona dla obiektu 
	 * @param x wsp�rz�dna X
	 * @param y wsp�rz�dna Y
	 * @param xDirection kierunek ruchu w osi X
	 * @param yDirection kierunek ruchu w osi Y 
	 * @param xSpeed szybko�� ruchu na osi X
	 * @param ySpeed szybko�� ruchu na osi Y
	 * @param predator czy mi�so�erny, true je�li tak, w przeciwnym wypadku false
	 * @param attack ilo�� punkt�w ataku
	 * @param hp ilo�� punkt�w �ycia
	 */
	public Animal(String rightImage, int x, int y, short xDirection, short yDirection, int xSpeed, int ySpeed, boolean predator, int attack, int hp)
	{
		this(rightImage, rightImage, x, y, xDirection, yDirection, xSpeed, ySpeed, predator, attack, hp);
	}
	
	
	@Override
	public int getxSpeed() {
		return xSpeed;
	}
	
	
	@Override
	public int getySpeed() {
		return ySpeed;
	}
	
	
	@Override
	public short getxDirection() {
		return xDirection;
	}
	

	@Override
	public void setxDirection(short xDirection) {
		this.xDirection = xDirection;
	}
	
	
	@Override
	public short getyDirection() {
		return yDirection;
	}
	
	
	@Override
	public void setyDirection(short yDirection) {
		this.yDirection = yDirection;
	}
	
	
	@Override
	public void changeDirection()
	{
		this.xDirection*=-1;
		this.yDirection*=-1;
	}
	
	
	@Override
	public boolean isPredator()
	{
		return this.predator;
	}
	
	/**
	 * @return punkty ataku
	 */
	public int getAttack()
	{
		return this.attackPoint;
	}

	
	@Override
	public void setGroup(Group group) {
		this.group=group;
		
	}
	
	
	@Override
	public Group getGroup() {
		return this.group;
		
	}

	
	@Override
	public boolean isGrouped() {
		if(group!=null) return true;
		else return false;
	}
	
	/**
	 * Metoda zmienia ikon� obiektu w zale�no�ci od jego kierunku ruchu w osi X
	 * @param leftImage ikona dla obiektu poruszaj�cego si� w lewo
	 * @param rightImage ikona dla obiektu poruszaj�cego si� w prawo
	 */
	private void changeImage()
	{
		if(xDirection==1) setIcon(rightImage);
		else if(xDirection==-1) setIcon(leftImage);
	}
	
	@Override
	/**
	 * Metoda zwraca X oraz zmienia ikon� je�li zmieni� si� kierunek ruchu 
	 */
	public int getX()
	{	
		changeImage();
		return x;
	}
	
	@Override
	public int getHp()
	{
		return hp;
	}
	@Override
	public void hpUp(int hp)
	{
		this.hp+=hp;
	}
	
	
}
