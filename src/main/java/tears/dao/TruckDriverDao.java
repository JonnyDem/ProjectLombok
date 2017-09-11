package tears.dao;

import tears.model.TruckDriver;

import java.util.List;

public interface TruckDriverDao {

    /**
     * @param name
     * @param surname
     * @param age
     * @param tons - how many tons were delivered by this driver.
     * @param years - how many years driver has being working in the company.
     */
    void addDriverToDataBase(String name,String surname,int age,String phone, int tons, int years );

    /**
     * @param driverId - identification number of driver.
     *     Deletes driver from data base.
     */
     void deleteDriverById(int driverId);

     void getDriverById(int driverId);

     String getNameById(int driverId);

    String getSurnameById(int driverId);

    int getAgeById(int driverId);

    int getHowManyTonsWereDelivered(int driverId);

    int getHowManyYearsWorksInCompany(int driverId);

     String getPhoneById(int driverId);

     boolean isDriverExists(int driverId);

    /**
     * @return all data base (you can see it in console)
     */
     List<TruckDriver> getAllDataBase();
}
