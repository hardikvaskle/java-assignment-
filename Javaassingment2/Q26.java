import java.util.Scanner;

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class Q26  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name ");
        String name = scanner.nextLine();

        System.out.println("Enter age ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Name " + name);
            System.out.println("Age " + age);
        } catch (NegativeAgeException e) {
            System.out.println("Invalid age " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws NegativeAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative");
        }
    }
}
