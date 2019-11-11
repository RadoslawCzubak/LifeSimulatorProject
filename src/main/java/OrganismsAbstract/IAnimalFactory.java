package OrganismsAbstract;

/**
 * Interfejs dla klasy AnimalFactory
 * @author Rados�aw Czubak
 *
 */
public interface IAnimalFactory {

	/**
	 * Tworzy obiekt danej klasy o losowych wsp�rz�dnych
	 * @param choice wyb�r klasy obiektu
	 * @return nowy obiekt
	 */
	IAnimal createRandomAnimal(String choice);
	
	/**
	 * Tworzy obiekt danej klasy o wsp�rz�dnych podanych w parametrach.
	 * @param choice wyb�r klasy nowego obiektu
	 * @param x wsp�rz�dna X
	 * @param y wsp�rz�dna Y
	 * @return nowy obiekt
	 */
	IAnimal createAnimal(String choice, int x, int y);
}
