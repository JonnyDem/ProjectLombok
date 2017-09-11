package tears.services.massageservice;

public interface MessageSending {

    /**
     * @param message
     * @param id - driverId
     *   Sends messages.
     */
    void sendMassage(String message, int id);
}
