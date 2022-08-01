package Projects.P04_Library.Exceptions;

public class NoMoreSpaceToAddBooks extends Exception{
    public NoMoreSpaceToAddBooks(String message) {
        super(message);
    }

}
