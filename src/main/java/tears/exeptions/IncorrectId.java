package tears.exeptions;

/**
 * Created by Ваня on 02.09.2017.
 */
public class IncorrectId extends Exception {

    @Override
    public void printStackTrace() {
        System.err.println("Incorrect driver Id");
    }
}
