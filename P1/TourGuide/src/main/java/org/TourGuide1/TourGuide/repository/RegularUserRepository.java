package org.TourGuide1.TourGuide.repository;


import org.TourGuide1.TourGuide.model.RegularUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
/**@author Bruchental Maria Andreea
 * @version 1.0
 * @since 18.04.2019
  **/
public interface RegularUserRepository extends JpaRepository<RegularUser,Integer>, CrudRepository<RegularUser,Integer> {
 

}
