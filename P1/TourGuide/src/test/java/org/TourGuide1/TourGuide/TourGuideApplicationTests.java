package org.TourGuide1.TourGuide;

import org.TourGuide1.TourGuide.model.Admin;
import org.TourGuide1.TourGuide.model.Editor;
import org.TourGuide1.TourGuide.model.RegularUser;
import org.TourGuide1.TourGuide.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**@author Bruchental Maria Andreea
 * @version 1.0
 * @since 18.04.2019
  **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TourGuideApplicationTests {

	/**
	 * Testam daca Admin e instanta a User
	 */
	@Test
	public void checkAdmin() {
		User fromFactory = new Admin(); 
		assert(fromFactory instanceof User ==true);
		
	}
	/**
	 * Testam daca Editor e instanta a User
	 */
	@Test
	public void checkEditor() {
		User fromFactory = new Editor(); 
		assert(fromFactory instanceof User ==true);
		
	}
	/**
	 * Testam daca RegularUser e instanta a User
	 */
	@Test
	public void checkRegularUser() {
		User fromFactory = new RegularUser(); 
		assert(fromFactory instanceof User ==true);
		
	}
	

}
