import java.util.Scanner;

class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class customexception  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     try {
            System.out.println("Enter numerator ");
            int numerator = scanner.nextInt();

            System.out.println("Enter denominator ");
            int denominator = scanner.nextInt();

            if (denominator == 0) {
                throw new CustomArithmeticException("Division by zero not allowed.");
            }

            if (numerator == Integer.MAX_VALUE && denominator == 1) {
                throw new CustomArithmeticException("Overflow error.");
            }

            int result = numerator / denominator;
            System.out.println("Result " + result);

        } catch (CustomArithmeticException e) {
            System.out.println("Custom Arithmetic Exception " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception " + e.getMessage());
        } finally {
            System.out.println("Calculation completed");
        }
    }
}
