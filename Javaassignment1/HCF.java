import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
         int num1 = scanner.nextInt();
         int num2 = scanner.nextInt();
         int hcf = findHCF(num1, num2);
        
        System.out.println( num1 + " and " + num2 + " is: " + hcf);
    }
    
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
