package org.TourGuide1.TourGuide.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


import org.TourGuide1.TourGuide.model.City;

/**@author Bruchental Maria Andreea
 * @version 1.0
 * @since 18.04.2019
  **/
public interface CityRepository extends JpaRepository<City,Integer>, CrudRepository<City,Integer>  {



}
