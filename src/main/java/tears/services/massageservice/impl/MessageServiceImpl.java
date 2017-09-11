package tears.services.massageservice.impl;

import lombok.NoArgsConstructor;
import tears.exeptions.EmptyMassage;
import tears.exeptions.IncorrectId;
import tears.services.massageservice.MessageSending;
import tears.services.massageservice.MessageService;
import tears.services.massageservice.MessageType;
@NoArgsConstructor(staticName = "of")
public class MessageServiceImpl implements MessageService {


    /**
     * @param message
     * @return - some new object( derivative from MessageSending class)
     */
    public static MessageSending getTypeOfMessage(MessageType message){
        switch (message){
            case ADDRESS_OF_LOADING:
                return  MessageSendingAddressOfLoading.of();
            case ADDRESS_OF_DESTINATION:
                return  MessageSendingAddressOfDestination.of();
            case ADDRESS_OF_CUSTOMS:
                return  MessageSendingAddressOfCustoms.of();
            case PROBLEMS_ON_ROAD:
                return MessageSendingProblemsOnRoad.of();
            case OTHER_INFORMATION:
                return  MessageSendingOtherInformation.of();
                default:
                    return null;

        }
    }

    /**
     * {@inheritDoc}
     */
   public void sendMessage(String information, int id, MessageType messageType)throws EmptyMassage,IncorrectId{
       MessageSending messageSending = this.getTypeOfMessage(messageType);
       messageSending.sendMassage(information, id);
   }
}
