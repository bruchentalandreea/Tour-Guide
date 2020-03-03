package org.TourGuide1.TourGuide.factory;
import org.TourGuide1.TourGuide.model.Admin;
import org.TourGuide1.TourGuide.model.Editor;
import org.TourGuide1.TourGuide.model.RegularUser;
import org.TourGuide1.TourGuide.model.User;
import org.springframework.stereotype.Service;
/**@author Bruchental Maria Andreea
 * @version 1.0
 * @since 18.04.2019
  **/
public class UserFactory {

	 /**
     *Creeaza un obiect nou in functie de tip 
     * @return un obiect nou de tip Admin,RegularUser sau Editor
     */
    public static User createUser(int Id,UserType type,String Username, String FirstName, String LastName,
                                  String DateJoined, String Status,String email)
    {
        User newUser=null;
        switch(type){
        case Admin:
            newUser = new Admin();
            break;
        case RegularUser:
            newUser = new RegularUser();
            break;
        case Editor:
             newUser = new Editor();
             break;
    }

	return newUser;
    }
}
