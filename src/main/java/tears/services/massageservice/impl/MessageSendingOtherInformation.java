package tears.services.massageservice.impl;

import lombok.NoArgsConstructor;
import tears.dao.TruckDriverDao;
import tears.dao.impl.TruckDriverDaoImpl;
import tears.services.massageservice.MessageSending;
@NoArgsConstructor(staticName = "of")
public class MessageSendingOtherInformation implements MessageSending {

    /**
     {@inheritDoc}
     */
    @Override
    public void sendMassage(String message, int id) {
        TruckDriverDao driverDao=TruckDriverDaoImpl.of();
        System.out.println("Dear "+driverDao.getNameById(id)+" we are informing you that "+message);

    }
}
