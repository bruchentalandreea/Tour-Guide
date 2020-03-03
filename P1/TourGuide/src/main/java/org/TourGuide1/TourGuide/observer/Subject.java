package org.TourGuide1.TourGuide.observer;
/**@author Bruchental Maria Andreea
 * @version 1.0
 * @since 18.04.2019
  **/

public interface Subject {
	
		public void register(Observer o);
	
	    public void unregister(Observer o);
	
	    public void notifyObserver();

}