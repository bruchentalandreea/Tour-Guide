package org.TourGuide1.TourGuide.model;
/**@author Bruchental Maria Andreea
 * @version 1.0
 * @since 18.04.2019
  **/
public interface User {
	
	  int getId();


		void setId(Integer id);
		
		String getUsername();

		void setUsername(String username);

		String getFirstname();


		void setFirstname(String firstname);


		String getLastname();


		void setLastname(String lastname);


		String getUserstatus();


		void setUserstatus(String userstatus);


		String getEmail();


		void setEmail(String email);
}
