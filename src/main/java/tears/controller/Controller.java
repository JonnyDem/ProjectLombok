package tears.controller;

import lombok.SneakyThrows;
import tears.dao.factory.DaoFactory;
import tears.exeptions.EmptyMassage;
import tears.exeptions.IncorrectId;
import tears.services.TruckService.TruckService;
import tears.services.factory.ServiceFactory;
import tears.services.massageservice.MessageType;

import java.io.IOException;

public class Controller {

    public static void main(String[] args) {

        TruckService truckService = ServiceFactory.getTruckService();
        truckService.addDriverToDataBase("Johnny","D",32,"12345",345,3);
        truckService.addDriverToDataBase("Billy","Smith",54,"98765",34576,13);
        truckService.addDriverToDataBase("Mike","Gall",47,"18741",3457,5);
        System.out.println();
        truckService.getAllDataBase();
        System.out.println();

        try {
            truckService.sendMassage("Kiev, Nauki 12a.",2, MessageType.ADDRESS_OF_LOADING);
            truckService.sendMassage("our customer is still waiting.", 1, MessageType.OTHER_INFORMATION);
            truckService.sendMassage("New York, 123 avenue.", 3,MessageType.ADDRESS_OF_DESTINATION);
           // truckService.addingDriverToFile();
              truckService.printDriver();
           // truckService.copyFromFileToFile();
        } catch (IncorrectId|EmptyMassage|IOException e) {
            e.printStackTrace();
        }


    }
}
