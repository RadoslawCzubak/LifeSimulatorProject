package OrganismsAbstract;

/**
 * Interfejs dla klasy AnimalFactory
 * @author Rados³aw Czubak
 *
 */
public interface IAnimalFactory {

	/**
	 * Tworzy obiekt danej klasy o losowych wspó³rzêdnych
	 * @param choice wybór klasy obiektu
	 * @return nowy obiekt
	 */
	IAnimal createRandomAnimal(String choice);
	
	/**
	 * Tworzy obiekt danej klasy o wspó³rzêdnych podanych w parametrach.
	 * @param choice wybór klasy nowego obiektu
	 * @param x wspó³rzêdna X
	 * @param y wspó³rzêdna Y
	 * @return nowy obiekt
	 */
	IAnimal createAnimal(String choice, int x, int y);
}
