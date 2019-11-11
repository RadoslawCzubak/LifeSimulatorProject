package OrganismsAbstract;
/**
 * Interfejs fabryki klas dziedzicz�cych po klasie Plant
 * @author Rados�aw Czubak
 * @see Plant
 *
 */
public interface IPlantFactory {
	
	/**
	 * 
	 * @param choice Wyb�r klasy nowego obiektu
	 * @param x wsp�rz�dna X nowego obiektu
	 * @param y wsp�rz�dna Y nowego obiektu
	 * @return zwraca nowy obiekt o interfejsie IPlant
	 */
	IPlant createNewPlant(String choice, int x, int y);
	
	/**
	 * Metoda zwraca nowy obiekt o losowych wsp�rz�dnych
	 * @param choice wyb�r klasy nowego obiektu
	 * @return Nowy obiekt o interfejsie IPlant
	 */
	IPlant createRandomPlant(String choice);
	
	/**
	 * Metoda wykorzystywana do stworzenia nowego "dziecka" dla danego obiektu 
	 * @param plant "rodzic" dla nowego obiektu tej samej klasy	
	 * @param x wsp�rz�dna X
	 * @param y wsp�rzedna Y
	 * @return Nowy obiekt o interfejsie IPlant
	 */
	IPlant createNewChild(IPlant plant, int x, int y);


}
