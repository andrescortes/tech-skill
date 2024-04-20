package co.com.hotel.hotel.handlereception.exceptions;

public class NotFoundRoom extends RuntimeException {

    public NotFoundRoom(String message) {
        super(message);
    }
}
