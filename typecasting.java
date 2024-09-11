public class typecasting {
    public static void main(String[] args) {
       
      /*implicit 
          int num = 10;
          System.out.println("The integer value: " + num);
        
          double data = num;
          System.out.println("The double value: " + data);*/

      //explicit 
                
          double num = 10.99;
          System.out.println("The double value: " + num);
                
          int data = (int) num;
          System.out.println("The integer value: " + data);
    }
    
}
