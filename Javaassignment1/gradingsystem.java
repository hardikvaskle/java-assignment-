import java.util.Scanner;

public class gradingsystem {
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks: ");
        int percentage = scanner.nextInt();
        char grade;

        if (percentage  >= 90) {
            grade = 'A';
        } 
        else if (percentage  >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        }else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("grade is: " + grade);
    
    }
}
