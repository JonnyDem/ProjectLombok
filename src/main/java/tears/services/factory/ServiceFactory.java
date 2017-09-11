package tears.services.factory;

import tears.services.TruckService.TruckService;
import tears.services.TruckService.impl.TruckServiceImpl;
import tears.services.addingtofileservice.AddingDriverToFileService;
import tears.services.addingtofileservice.impl.AddingDriverToFileServiceImpl;
import tears.services.copyinformationtofileservice.CopyService;
import tears.services.copyinformationtofileservice.impl.CopyServiceImpl;
import tears.services.massageservice.MessageService;
import tears.services.massageservice.impl.MessageServiceImpl;
import tears.services.printservice.PrintDriverService;
import tears.services.printservice.impl.PrintDriverServiceImpl;

/**
 * Created by Ваня on 01.09.2017.
 */
public class ServiceFactory {

    /**
     * @return instance of {@link MessageService}.
     */
    public static MessageService getMessageService(){
        return MessageServiceImpl.of();
    }

    /**
     * @return instance of {@link TruckService}.
     */
    public static TruckService getTruckService(){
        return  TruckServiceImpl.of();
    }

    /**
     * @return instance of {@link AddingDriverToFileService}.
     */
    public static AddingDriverToFileService getAddingToFileService(){
        return AddingDriverToFileServiceImpl.of();
    }

    /**
     * @return instance of {@link PrintDriverService}.
     */
    public static PrintDriverService getPrintDriverService(){
        return  PrintDriverServiceImpl.of();
    }
    /**
     * @return instance of {@link CopyService}.
     */
    public static CopyService getCopyService(){
        return CopyServiceImpl.of();
    }
}

