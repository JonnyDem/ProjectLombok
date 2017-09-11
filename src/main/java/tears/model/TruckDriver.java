package tears.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Value;
import lombok.experimental.FieldDefaults;
import tears.database.TruckDriverDataBase;

import java.util.ArrayList;

/**
 * Created by Ваня on 23.08.2017.
 */

@Data
@FieldDefaults(level = AccessLevel.PUBLIC)
public class TruckDriver {

    String name;
    String surname;
    int age;
    int driverId;
    int howManyTonsWereDelivered;
    int howManyYearsWorksInCompany;
    String phoneNumber;


    /**  Constructor.
     * @param name
     * @param surname
     * @param age
     * @param howManyTonsWereDelivered
     * @param howManyYearsWorksInCompany
     */
   public TruckDriver(String name, String surname, int age,String phone, int howManyTonsWereDelivered, int howManyYearsWorksInCompany) {
       ArrayList<TruckDriver> list=TruckDriverDataBase.listOfDriver;
       this.name = name;
       this.surname = surname;
       this.age = age;
       phoneNumber=phone;
       driverId = 1;
        this.howManyTonsWereDelivered = howManyTonsWereDelivered;
        this.howManyYearsWorksInCompany = howManyYearsWorksInCompany;
         for (int i = 0; i < list.size(); i++) {
             if (driverId == list.get(i).driverId) {
                 driverId++;
                 i = 0;
             }
       }System.out.println("Driver "+name+" was successfully added to data base with Id: "+driverId);
    }
}
