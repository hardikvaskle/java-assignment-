import java.util.Scanner;

public class unitconvert {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double miles = scanner.nextDouble();
        double kilometers = miles * 1.60934;

        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
}
