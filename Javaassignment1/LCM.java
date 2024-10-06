import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int lcm = findLCM(num1, num2);
        
        System.out.println(num1 + " and " + num2 + " is: " + lcm);
        
       
    }
    
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    
    }
}
