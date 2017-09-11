package tears.services.TruckService;

import tears.exeptions.EmptyMassage;
import tears.exeptions.IncorrectId;
import tears.model.TruckDriver;
import tears.services.massageservice.MessageType;

import java.io.IOException;
import java.util.List;

public interface TruckService {
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

    String getPhoneById(int driverId);

    /**
     * @return all data base (you can see it in console)
     */
    List<TruckDriver> getAllDataBase();

    /**
     * @param message
     * @param id - driverId
     *   Sends messages by type.
     */
    int sendMassage(String message, int id, MessageType messageType) throws EmptyMassage,IncorrectId;

    void addingDriverToFile() throws IOException;

    /**
     * Prints driver from file to console
     */
    void printDriver() throws IOException;

    public void copyFromFileToFile() throws IOException;
}
