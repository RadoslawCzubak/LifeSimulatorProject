package OrganismsAbstract;
/**
 * Interfejs fabryki klas dziedzicz¹cych po klasie Plant
 * @author Rados³aw Czubak
 * @see Plant
 *
 */
public interface IPlantFactory {
	
	/**
	 * 
	 * @param choice Wybór klasy nowego obiektu
	 * @param x wspó³rzêdna X nowego obiektu
	 * @param y wspó³rzêdna Y nowego obiektu
	 * @return zwraca nowy obiekt o interfejsie IPlant
	 */
	IPlant createNewPlant(String choice, int x, int y);
	
	/**
	 * Metoda zwraca nowy obiekt o losowych wspó³rzêdnych
	 * @param choice wybór klasy nowego obiektu
	 * @return Nowy obiekt o interfejsie IPlant
	 */
	IPlant createRandomPlant(String choice);
	
	/**
	 * Metoda wykorzystywana do stworzenia nowego "dziecka" dla danego obiektu 
	 * @param plant "rodzic" dla nowego obiektu tej samej klasy	
	 * @param x wspó³rzêdna X
	 * @param y wspó³rzedna Y
	 * @return Nowy obiekt o interfejsie IPlant
	 */
	IPlant createNewChild(IPlant plant, int x, int y);


}
