
import java.util.Scanner;
public class checkdivisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting input from the user
        System.out.println("Enter the number to be checked: ");
        int number = scanner.nextInt();
        
        System.out.println("Enter the divisor: ");
        int divisor = scanner.nextInt();
        
        // Checking divisibility
        if (number % divisor == 0) {
            System.out.println(number + " is divisible by " + divisor);
        } else {
            System.out.println(number + " is not divisible by " + divisor);
        }
        
        scanner.close();
    }
}
