package org.TourGuide1.TourGuide.model;


import javax.persistence.*;
import javax.persistence.Table;
/**@author Bruchental Maria Andreea
 * @version 1.0
 * @since 18.04.2019
  **/
@Entity
@Table(name="City")
public class City  {
	   @Id
	    private Integer  id;
	    private String nume;
	    private String descriere;
	    private String imageURL;
	    

	    
	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getNume() {
	        return nume;
	    }	

	    public void setNume(String nume) {
	        this.nume = nume;
	    }

		public String getImageURL() {
			return imageURL;
		}

		public void setImageURL(String imageURL) {
			this.imageURL = imageURL;
		}

	    public String getDescriere() {
	        return descriere;   
	    }

	    public void setDescriere(String descriere) {
	        this.descriere = descriere;

	    }


	}