package tears.services.massageservice.impl;

import lombok.NoArgsConstructor;
import tears.dao.TruckDriverDao;
import tears.dao.impl.TruckDriverDaoImpl;
import tears.services.massageservice.MessageSending;
@NoArgsConstructor(staticName = "of")
public class MessageSendingAddressOfLoading implements MessageSending {

    /**
     {@inheritDoc}
     */
    @Override
    public void sendMassage(String address ,int id) {
        TruckDriverDao driverDao=TruckDriverDaoImpl.of();
        System.out.println("Dear "+driverDao.getNameById(id)+" address of loading is "+address);


    }
}
