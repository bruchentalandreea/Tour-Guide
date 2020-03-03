package org.TourGuide1.TourGuide.repository;


/**@author Bruchental Maria Andreea
 * @version 1.0
 * @since 18.04.2019
  **/

import org.TourGuide1.TourGuide.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface AdminRepository extends JpaRepository<Admin,Integer>, CrudRepository<Admin,Integer> {
 
}
