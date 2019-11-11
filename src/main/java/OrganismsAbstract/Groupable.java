package OrganismsAbstract;

/**
 * Interfejs dla klas mog¹cych ³¹czyæ siê w grupy
 * @author Rados³aw Czubak
 *
 */
public interface Groupable {
	
	/**
	 * @param group
	 * Grupa, do której obiekt ma byæ do³¹czony
	 */
	void setGroup(Group group);
	/**
	 * @return grupa, do której przypisany jest obiekt
	 */
	Group getGroup();
	
	/**
	 * @return true, je¿eli obiekt nale¿y do jakiejœ grupy. W przeciwnym razie false
	 */
	boolean isGrouped();

}
