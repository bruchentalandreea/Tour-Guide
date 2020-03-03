package org.TourGuide1.TourGuide.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.TourGuide1.TourGuide.model.City;
//import org.TourGuide1.TourGuide.observer.CityObserver;
import org.TourGuide1.TourGuide.repository.CityRepository;
import org.TourGuide1.TourGuide.repository.RepositoryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
/**@author Bruchental Maria Andreea
 * @version 1.0
 * @since 18.04.2019
  **/
@EnableAutoConfiguration
@RestController
@RequestMapping("/city")
public class CityController {

	
	@Autowired
    private CityRepository cityRepository;
	
    @GetMapping("/ceva")
    public String getCeva() {
    	return "ceva";
    }
    /**
     * Ia datele din baza de date
     *
     * @return o lista de orase
     */
    @GetMapping("/all")
    public List<City> getAll(){
        return cityRepository.findAll();
    }
  
    /**
	   * @param un obiect de tip City
	   * @return mesaj in caz ca s-a adaugat cu succes
	   */
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public String addCity (@Valid @RequestBody City city) {
    	 cityRepository.save(city);
    	 return"Succes";
    }
    
    /**
	   * @param un obiect de tip City
	   * @return mesaj in caz ca s-a sters cu succes
	   */
    @PostMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public String deleteCity (@Valid @RequestBody City city) {
    	cityRepository.delete(city);
    	return "City deleted";
    }
    

    /*
    @GetMapping("/allByNume")
    public List<City> findCity(@Valid @RequestBody City c){

        List<City> cities = cityRepository.findAllByNume(c);
    return cities;
    }*/
}