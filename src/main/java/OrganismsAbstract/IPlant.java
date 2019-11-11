package OrganismsAbstract;

/**
 * Interfejs dla klasy Plant
 * @author Rados³aw Czubak
 *
 */
public interface IPlant extends IOrganism {

	/**
	 * 
	 * @return czas reprodukcji obiektu.
	 */
	int getReproductionTime();
	
	/**
	 * 
	 * @return wartoœæ atrybutu generation.
	 */
	int getGeneration();
	
	/**
	 * Metoda pozwala zmieniæ wartoœæ atrybutu generation.
	 * @param amount - nowa wartoœæ
	 */
	void setGeneration(int amount);
	
	/**
	 * Zwiêksza generacjê obiektu.
	 */
	void upGeneration();
}
