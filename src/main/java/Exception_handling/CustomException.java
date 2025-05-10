package Exception_handling;

// Custom checked exception
public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);  // Pass the message to the parent Exception class
    }
}
