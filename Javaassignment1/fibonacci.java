import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting the number of terms from the user
        System.out.println("Enter the number of terms in the Fibonacci series: ");
        int terms = scanner.nextInt();
        
        int firstTerm = 0, secondTerm = 1;
        
        System.out.println("Fibonacci Series up to " + terms + " terms:");

        for (int i = 1; i <= terms; ++i) {
            System.out.print(firstTerm + " ");
            
            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        
        
        
    }
}
