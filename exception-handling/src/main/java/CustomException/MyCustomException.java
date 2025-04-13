package CustomException;

// this is a checked exception which must be handled in the code
// for unchecked exception you can extend RuntimeException
// we should always go for checked because that is why we are creating custom one
// to make sure to handle it in the code

public class MyCustomException extends Exception {
    // having just a default constructor, will not allow to pass the message
    // so let's have a constructor for the message
    public MyCustomException(String message) {
        // pass the message to the parent
        super(message);
    }
    public MyCustomException() {
        super();
    }
}
