package Projects.P04_Library.Exceptions;

public class BookNotAvailable extends Exception{

    public BookNotAvailable(String message) {
        super(message);
    }
}
