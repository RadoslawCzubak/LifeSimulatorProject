package OrganismsAbstract;

/**
 * Interfejs dla klasy Plant
 * @author Rados�aw Czubak
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
	 * @return warto�� atrybutu generation.
	 */
	int getGeneration();
	
	/**
	 * Metoda pozwala zmieni� warto�� atrybutu generation.
	 * @param amount - nowa warto��
	 */
	void setGeneration(int amount);
	
	/**
	 * Zwi�ksza generacj� obiektu.
	 */
	void upGeneration();
}
