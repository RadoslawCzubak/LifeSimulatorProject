package OrganismsAbstract;

/**
 * Interfejs dla klas mog�cych ��czy� si� w grupy
 * @author Rados�aw Czubak
 *
 */
public interface Groupable {
	
	/**
	 * @param group
	 * Grupa, do kt�rej obiekt ma by� do��czony
	 */
	void setGroup(Group group);
	/**
	 * @return grupa, do kt�rej przypisany jest obiekt
	 */
	Group getGroup();
	
	/**
	 * @return true, je�eli obiekt nale�y do jakiej� grupy. W przeciwnym razie false
	 */
	boolean isGrouped();

}
