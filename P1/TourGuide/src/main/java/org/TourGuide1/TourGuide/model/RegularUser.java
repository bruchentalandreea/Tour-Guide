package org.TourGuide1.TourGuide.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**@author Bruchental Maria Andreea
 * @version 1.0
 * @since 18.04.2019
  **/
@Entity
@Table(name="RegularUser")
public class RegularUser implements User {
	   @Id
	    private Integer  id;
	    private String username;
	    private String firstname;
	    private String lastname;
	    private String userstatus;
	    private String email;
	    

	    @Override
		public void setId(Integer id) {
			this.id = id;
		}

	    @Override
		public String getUsername() {
			return username;
		}

	    @Override
		public void setUsername(String username) {
			this.username = username;
		}

	    @Override
		public String getFirstname() {
			return firstname;
		}

	    @Override
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

	    @Override
		public String getLastname() {
			return lastname;
		}
	    

	    @Override
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

	    @Override
		public String getUserstatus() {
			return userstatus;
		}

	    @Override
		public void setUserstatus(String userstatus) {
			this.userstatus = userstatus;
		}

	    @Override
		public String getEmail() {
			return email;
		}

	    @Override
		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public int getId() {
			return id;
		}
	    

}


