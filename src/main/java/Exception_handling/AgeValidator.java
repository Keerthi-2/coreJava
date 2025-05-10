package Exception_handling;

public class AgeValidator {
    // This method will throw the custom exception if age is invalid
    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}

