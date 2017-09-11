package tears.dao.impl;

import lombok.*;
import tears.dao.TruckDriverDao;
import tears.database.TruckDriverDataBase;
import tears.model.TruckDriver;
import java.util.List;


@NoArgsConstructor(staticName = "of")
public class TruckDriverDaoImpl implements TruckDriverDao {


    /**
     {@inheritDoc}
     */
    public void addDriverToDataBase(String name, String surname, int age,String phone, int tons, int years) {
        TruckDriverDataBase.listOfDriver.add(new TruckDriver(name, surname, age, phone, tons, years));

    }

    public void deleteDriverById(int driverId) {
        int count=0;
        for (int i = 0; i <TruckDriverDataBase.listOfDriver.size() ; i++) {
            if (driverId == TruckDriverDataBase.listOfDriver.get(i).getDriverId()) {
                System.out.println("Driver with Id: "+driverId+" was deleted.");
                TruckDriverDataBase.listOfDriver.remove(i);
                count++;
            }
        }if(count==0){
            System.out.println("There is no driver with this Id.");
        }
    }

    public void getDriverById(int driverId) {
        int count=0;
       for(TruckDriver driver:TruckDriverDataBase.listOfDriver){
           if(driverId==driver.getDriverId()){
               count++;
               System.out.print("name: "+driver.getName()+", ");
               System.out.print("surname: "+driver.getSurname()+", ");
               System.out.print("age: "+driver.getAge()+", ");
               System.out.print("Id: "+driver.getDriverId()+", ");
               System.out.print("phone: "+driver.getPhoneNumber()+", ");
               System.out.print("were delivered: "+driver.getHowManyTonsWereDelivered()+" tons, ");
               System.out.println(" years in company: "+driver.getHowManyYearsWorksInCompany());
           }
       }if(count==0){
            System.out.println("There is no driver with this Id.");
        }
    }

    @Override
    public String getNameById(int driverId) {
        int count=0;
        for (TruckDriver driver:TruckDriverDataBase.listOfDriver){
            if(driverId==driver.getDriverId()){
                count++;
                return driver.getName();
            }
        }if(count==0){
            System.out.println("There is no driver with this id.");
        }
        return  null;
    }

    @Override
    public String getSurnameById(int driverId) {
        int count=0;
        for (TruckDriver driver:TruckDriverDataBase.listOfDriver){
            if(driverId==driver.getDriverId()){
                count++;
                return   driver.getSurname();
            }
        }if(count==0){
            System.out.println("There is no driver with this id.");
        }
        return null;
    }

    @Override
    public int getAgeById(int driverId) {
        int count=0;
        for (TruckDriver driver:TruckDriverDataBase.listOfDriver){
            if(driverId==driver.getDriverId()){
                count++;
                return   driver.getAge();
            }
        }if(count==0){
            System.out.println("There is no driver with this id.");
        }
        return -1;
    }

    @Override
    public int getHowManyTonsWereDelivered(int driverId) {
        int count=0;
        for (TruckDriver driver:TruckDriverDataBase.listOfDriver){
            if(driverId==driver.getDriverId()){
                count++;
                return   driver.getHowManyTonsWereDelivered();
            }
        }if(count==0){
            System.out.println("There is no driver with this id.");
        }
        return -1;
    }

   @Override
    public int getHowManyYearsWorksInCompany(int driverId) {
        int count=0;
        for (TruckDriver driver:TruckDriverDataBase.listOfDriver){
            if(driverId==driver.getDriverId()){
                count++;
                return   driver.getHowManyYearsWorksInCompany();
            }
        }if(count==0){
            System.out.println("There is no driver with this id.");
        }
        return -1;
    }


    @Override
    public String getPhoneById(int driverId) {
        int count=0;
        for (TruckDriver driver:TruckDriverDataBase.listOfDriver){
            if(driverId==driver.getDriverId()){
                count++;
              return   driver.getPhoneNumber();
            }
        }if(count==0){
            System.out.println("There is no driver with this id.");
        }
        return null;
    }

    @Override
    public boolean isDriverExists(int driverId) {
        for (TruckDriver driver:TruckDriverDataBase.listOfDriver){
            if(driverId==driver.getDriverId()){
                return true;
            }
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public List<TruckDriver> getAllDataBase() {
        for (TruckDriver driver:TruckDriverDataBase.listOfDriver){
            System.out.print("name: "+driver.getName()+", ");
            System.out.print("surname: "+driver.getSurname()+", ");
            System.out.print("age: "+driver.getAge()+", ");
            System.out.print("Id: "+driver.getDriverId()+", ");
            System.out.print("phone: "+driver.getPhoneNumber()+", ");
            System.out.print("were delivered: "+driver.getHowManyTonsWereDelivered()+" tons, ");
            System.out.println(" years in company: "+driver.getHowManyYearsWorksInCompany());
        }
        return TruckDriverDataBase.listOfDriver;
    }
}

