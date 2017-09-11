package tears.services.massageservice;

import tears.exeptions.EmptyMassage;
import tears.exeptions.IncorrectId;


public interface MessageService {

     /**
      * @param message
      * @return class that implements interface MessageSending.
      */
    static MessageSending getTypeOfMessage(MessageType message){
         return null;
    };

    /**
     * @param information
     * @param id - driver id
     * @param messageType - some data from enum MessageType
     */

    void sendMessage(String information, int id, MessageType messageType)throws EmptyMassage,IncorrectId;


}
