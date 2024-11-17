public class negativeaarayindex {
    public static void main(String[] args) {
        try {
            // Attempt to access an array with a negative index
            int[] arr = {1, 2, 3};
            System.out.println("Accessing array element: " + arr[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught NegativeArrayIndexException: " + e.getMessage());
        }

        try {
            // Attempt to perform division by zero
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}