package tears.dao.factory;

import tears.dao.TruckDriverDao;
import tears.dao.impl.TruckDriverDaoImpl;

/**
 * Created by Ваня on 01.09.2017.
 */
public class DaoFactory {


    /**
     * @return instance of {@link TruckDriverDao}.
     */

    public static TruckDriverDao getTruckDriverDao(){
        return TruckDriverDaoImpl.of();
    }
}
