package org.TourGuide1.TourGuide.observer;

import org.TourGuide1.TourGuide.observer.CitySubject ;
/**@author Bruchental Maria Andreea
 * @version 1.0
 * @since 18.04.2019
  **/

public class CityAdder {
	 public static void main(String[] args){
		 
		 CitySubject city=new CitySubject ();
		 CityObserver cityObserver=new CityObserver(city);
		 city.setDescriere("Oras frumos");
		 city.setNume("Aiud");
		 
		 CityObserver cityObserver1=new CityObserver(city);
		 city.setDescriere("Oras mare");
		 city.setNume("Brasov");
	 }
}
