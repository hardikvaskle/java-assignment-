class Emp{
    String name;
    int age;

    public Emp() {
        name = "hardik";
        age = 20;
    }

    void display() {
    System.out.println(name);
     System.out.println(age);
    }
}

public class constructor {
    public static void main(String[] args) {
       
        Emp id = new Emp();
         id.display();
      }
    }

