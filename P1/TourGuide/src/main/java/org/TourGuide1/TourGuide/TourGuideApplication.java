package org.TourGuide1.TourGuide;

/**@author Bruchental Maria Andreea
 * @version 1.0
 * @since 18.04.2019
  **/
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class TourGuideApplication {

	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "hello";
		}
	
	public static void main(String[] args) {
		SpringApplication.run(TourGuideApplication.class, args);
	}

}
