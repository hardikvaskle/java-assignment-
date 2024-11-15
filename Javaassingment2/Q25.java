import java.util.Scanner;

class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }
}

public class  Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        System.out.println("Confirm password: ");
        String confirmPassword = scanner.nextLine();

        try {
            validateUser(username, password, confirmPassword);
            System.out.println("User validated successfully.");
        } catch (InvalidUserException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }

    public static void validateUser(String username, String password, String confirmPassword) throws InvalidUserException {
        if (username.length() < 6) {
            throw new InvalidUserException("Username must be at least 6 characters long.");
        }

        if (!password.equals(confirmPassword)) {
            throw new InvalidUserException("Passwords not match.");
        }
    }
}
