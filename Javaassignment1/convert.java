import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*binary to decimal
        System.out.println("Enter a binary number: ");
        String binary = scanner.nextLine();
        int decimal = Integer.parseInt(binary, 2);

        System.out.println("The decimal is: " + decimal);*/

        //decimal to binary
        System.out.println("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String binary = Integer.toBinaryString(decimal);

        System.out.println("The binary is: " + binary);
    
    
    }
}
