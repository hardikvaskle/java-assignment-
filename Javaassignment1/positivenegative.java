package Javaassignment1;
import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        double number = sc.nextDouble();

        if (number > 0) {
            System.out.println(number + " is positive number.");
        }
         else if (number < 0) {
            System.out.println(number + " is negative number.");
        }
         else {
            System.out.println(" number is zero.");
        }
    }
}
