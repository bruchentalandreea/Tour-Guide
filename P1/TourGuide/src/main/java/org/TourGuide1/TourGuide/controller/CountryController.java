package org.TourGuide1.TourGuide.controller;

import java.util.List;


import javax.validation.Valid;
import org.TourGuide1.TourGuide.model.Country;
import org.TourGuide1.TourGuide.repository.CountryRepository;
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
@RequestMapping("/country")
public class CountryController {

	
	@Autowired
    private CountryRepository countryRepository;

    @GetMapping("/ceva")
    public String getCeva() {
    	return "ceva";
    }
    
    /**
     * Ia datele din baza de date
     *
     * @return o lista de tari
     */
    @GetMapping("/all")
    public List<Country> getAll(){
        return countryRepository.findAll();
    }
  
    /**
	   * @param un obiect de tip Country
	   * @return mesaj in caz ca s-a adaugat cu succes
	   */
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public String addCountry (@Valid @RequestBody Country country) {
    	countryRepository.save(country);
    	 return"Succes";
    }
    
    /**
	   * @param un obiect de tip Country
	   * @return mesaj in caz ca s-a sters cu succes
	   */
    @PostMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public String deleteCountry(@Valid @RequestBody Country country) {
    	countryRepository.delete(country);
    	return "Country deleted";
    }
    
    /*
    @GetMapping("/allByNume")
    public List<City> findCity(@Valid @RequestBody City c){

        List<City> cities = cityRepository.findAllByNume(c);
    return cities;
    }*/
}