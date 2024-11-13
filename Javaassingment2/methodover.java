class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }
}

public class methodover{
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        System.out.println("Sum of two integers: " + mathOps.add(10, 20));
        System.out.println("Sum of three integers: " + mathOps.add(10, 20, 30));
        System.out.println("Sum of two doubles: " + mathOps.add(10.5, 20.5));
        System.out.println("Sum of three doubles: " + mathOps.add(10.5, 20.5, 30.5));
    }
}



