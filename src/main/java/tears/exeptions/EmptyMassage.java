package tears.exeptions;

/**
 * Created by Ваня on 02.09.2017.
 */
public class EmptyMassage extends Exception {

    @Override
    public void printStackTrace() {
        System.err.println("Empty massage");
    }
}
