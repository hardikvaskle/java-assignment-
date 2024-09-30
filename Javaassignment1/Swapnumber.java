package Javaassignment1;

//swapping two numbers 
public class Swapnumber {
    public static void main(String[] args) {
        int a= 6;
        int b = 7;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        int temp = a;
         a = b;
         b = temp;

         System.out.println("after swap");
         System.out.println("a = "+ a);
        System.out.println("b = "+ b);

    }
}
