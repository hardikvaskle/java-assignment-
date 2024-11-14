import java.util.Scanner;

public class consecutivedigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter digits ");
        String input = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            String subStr = input.substring(i, i + 2);
            sum += Integer.parseInt(subStr);
        }

        System.out.println("The sum of numbers formed by consecutive pairs of digits is " + sum);
    }
}


