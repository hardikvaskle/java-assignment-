import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
         int start = scanner.nextInt();
         int end = scanner.nextInt();
        
        System.out.println("Multiples of 10 between " + start + " and " + end + ":");
        
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }
       
    }
}
