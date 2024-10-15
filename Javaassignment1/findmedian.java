import java.util.Arrays;
import java.util.Scanner;

public class findmedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);

        double median;
        if (n % 2 == 0) {
            median = ((double) numbers[n/2] + (double) numbers[n/2 - 1]) / 2;
        } else {
            median = (double) numbers[n/2];
        }

        System.out.println("The median is: " + median);
    
    }
}
