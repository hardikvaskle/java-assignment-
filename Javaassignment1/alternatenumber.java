import java.util.Scanner;

public class alternatenumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i += 2) {
            System.out.print(numbers[i] + " ");
        }
    }
}

    
