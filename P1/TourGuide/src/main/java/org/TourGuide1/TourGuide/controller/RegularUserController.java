package org.TourGuide1.TourGuide.controller;

import java.util.List;

import javax.validation.Valid;

import org.TourGuide1.TourGuide.model.RegularUser;

import org.TourGuide1.TourGuide.repository.RegularUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/regularuser")
public class RegularUserController {

	
	@Autowired
    private RegularUserRepository regularUserRepository;

 
    @GetMapping("/all")
    public List<RegularUser> getAll(){
        return regularUserRepository.findAll();
    }
  
    /**
     * Ia datele din baza de date
     *
     * @return o lista de regularuseri
     */
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public String addCity (@Valid @RequestBody  RegularUser regularUser) {
    	regularUserRepository.save(regularUser);
    	 return"Succes";
    }
    
    
    @PostMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public String deleteCity (@Valid @RequestBody RegularUser regularUser) {
    	regularUserRepository.delete(regularUser);
    	return "RegularUser deleted";
    }
    
   
    /*
    @GetMapping("/allByNume")
    public List<City> findCity(@Valid @RequestBody City c){

        List<City> cities = cityRepository.findAllByNume(c);
    return cities;
    }*/
}