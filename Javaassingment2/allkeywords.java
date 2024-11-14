import java.util.Scanner;

class allkeywords {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();

            checkAge(age);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
        try {
            System.out.println("Demonstrating throw keyword:");
            throw new NullPointerException("This is a manually thrown exception.");
        } catch (NullPointerException e) {
            System.out.println("Caught a manually thrown exception: " + e.getMessage());
        } finally {
            System.out.println("Final block executed after manual throw.");
        }
    }
}


