package org.TourGuide1.TourGuide.observer;
/**@author Bruchental Maria Andreea
 * @version 1.0
 * @since 18.04.2019
  **/
public class CityObserver implements Observer{
	
	private String nume;
    private String descriere;
    
    private static int observerIdTracker=0;
    private int observerId;    
    private Subject city;
    
    /**
     *  Avertizeaza ultilizatorul ca s-au produs unele modificari. S-a adaugat un oras.
     */
    public CityObserver(Subject city)
    {
    	this.city=city;
    	this.observerId=++ observerIdTracker;
    	System.out.println("City added"+ this.observerId);
    	city.register(this);
    }
    /**
     * Face update la oras
     */
	@Override
	public void update(String nume, String descriere) {
		this.nume=nume;
		this.descriere=descriere;
	}
	
	
	public void printAll() 
	{
		System.out.println(observerId + "\nNume Oras" + nume + "\nDescriere Oras" + descriere );
	}
	
	  public int getObserverState() {
		    return observerId;
		  }
}
