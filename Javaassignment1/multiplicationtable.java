import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number to print multiplication table: ");
        int number = scanner.nextInt();
        
        System.out.println("Multiplication Table of " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
