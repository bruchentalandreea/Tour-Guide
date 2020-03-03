package org.TourGuide1.TourGuide;

import static org.junit.Assert.assertEquals;

import org.TourGuide1.TourGuide.observer.CityObserver;
import org.TourGuide1.TourGuide.observer.CitySubject;
import org.TourGuide1.TourGuide.observer.Observer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObserverTests {

	 @Test
	  public void testObserver() throws CloneNotSupportedException {

	    CitySubject subject = new CitySubject();

	    Observer observer = new CityObserver(subject);
	    subject.register(observer);
	    subject.setObserverId(1);

	    /**
	     *  verifica daca modificarile sunt propagate
	     */
	    assertEquals(1, ((CityObserver) observer).getObserverState());

	    subject.unregister(observer);
	    subject.setObserverId(0);

	    /**
	     *  observer e unregister deci modificarile nu sunt propagate
	     */
	    assertEquals(1, ((CityObserver) observer).getObserverState());
}
}
