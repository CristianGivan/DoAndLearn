package Projects.Library.Exceptions;

public class NoMoreSpaceToAddBooks extends Exception{
    public NoMoreSpaceToAddBooks(String message) {
        super(message);
    }

}