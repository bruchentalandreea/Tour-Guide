package org.TourGuide1.TourGuide.repository;
/**@author Bruchental Maria Andreea
 * @version 1.0
 * @since 18.04.2019
  **/
public interface RepositoryFactory {
	CityRepository createCityRepository();
	CountryRepository countryCityRepository();
	AdminRepository createAdminRepository();
	EditorRepository createEditorRepository();
	RegularUserRepository createRegularUserRepository();
}
