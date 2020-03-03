package org.TourGuide1.TourGuide.controller;

import java.util.List;

import javax.validation.Valid;

import org.TourGuide1.TourGuide.model.Admin;

import org.TourGuide1.TourGuide.repository.AdminRepository;
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
@RequestMapping("/admin")
public class AdminController {

	
	@Autowired
    private AdminRepository adminRepository;

	  @GetMapping("/ceva")
	    public String getCeva() {
	    	return "ceva";
	    }
 
	  /**
	     * Ia datele din baza de date
	     * @return o lista de Admini
	     */
	  
    @GetMapping("/all")
    public List<Admin> getAll(){
        return adminRepository.findAll();
    }
  
    /**
	   * @param un obiect de tip Admin
	   * @return mesaj in caz ca s-a adaugat cu succes
	   */
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public String addAdmin(@Valid @RequestBody  Admin admin) {
    	adminRepository.save(admin);
    	 return"Succes";
    }
    
    /**
	   * @param un obiect de tip Admin
	   * @return mesaj in caz ca s-a sters cu succes
	   */
    @PostMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public String deleteAdmin(@Valid @RequestBody  Admin admin) {
    	adminRepository.delete(admin);
    	return "Admin deleted";
    }
    
}