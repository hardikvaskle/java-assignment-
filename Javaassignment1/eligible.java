import java.util.Scanner;

public class eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("marks in maths");
        int maths = sc.nextInt();

        System.out.println("marks in phy");
        int physics = sc.nextInt();

        System.out.println("marks in chemistry");
        int chemistry = sc.nextInt();


        boolean condition1 = (maths>= 60 && physics>=50 && chemistry >= 40 && (maths + physics+chemistry)>=200 );
       boolean condition2 = (maths + physics )>= 150;
    

       if (condition1 || condition2 ){
        System.out.println("student is eligible for admission");
       }
       else{
        System.out.println("not eligible");
       }

    }
}
