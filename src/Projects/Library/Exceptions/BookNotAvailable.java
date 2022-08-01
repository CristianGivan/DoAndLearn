package Projects.Library.Exceptions;

public class BookNotAvailable extends Exception{

    public BookNotAvailable(String message) {
        super(message);
    }
}
