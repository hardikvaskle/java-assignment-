package Javaassignment1;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to convert Celsius to Fahrenheit");
        System.out.println("Enter 2 to convert Fahrenheit to Celsius");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println( fahrenheit);
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit - 32) * 5/9;
                System.out.println(celsius);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}

    