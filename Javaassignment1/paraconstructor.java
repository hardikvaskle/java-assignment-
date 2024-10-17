class Emp{
    String name;
    int age;

    public Emp(String name, int age) {
       this.name =  name;
        this.age = age;
    }

void display() {
    System.out.println(name);
     System.out.println(age);
    }
}

public class paraconstructor {
    public static void main(String[] args) {
       Emp aEmp = new Emp("hardik", 20);
      aEmp.display();
    }
}
