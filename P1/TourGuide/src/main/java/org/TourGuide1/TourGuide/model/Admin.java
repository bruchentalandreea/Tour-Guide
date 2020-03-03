package org.TourGuide1.TourGuide.model;

/*
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
*/

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;
/**@author Bruchental Maria Andreea
 * @version 1.0
 * @since 18.04.2019
  **/

@Entity
@Table(name="Admin")
public class Admin implements User {
    //Generam primary keys
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
    
	
	/**
	 * Methods to manipulate each client personal city Set . 
	 */
	/*public void removeCity(City city) {
		Iterator<City> iterator = cityList.iterator();
		while (iterator.hasNext()) {
			City city2 = (City) iterator.next();
			if (city2.getId().equals(city.getId())) {
				iterator.remove();
			}
		}
	}

	public boolean contains(City city) {
		for (City index : this.cityList) {
			if (index.getId() ==city.getId()) {
				return true;
			}
		}
		return false;
	}

	public void clearCity() {
		this.cityList.clear();
	}

	public Set<City> getCityList() {
		return cityList;
	}

	public void setCityList(Set<City> cityList) {
		this.cityList = cityList;
	}
*/
    }


