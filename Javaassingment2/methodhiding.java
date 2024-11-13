class Parent {
    static void display() {
        System.out.println("Static method from Parent");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Static method from Child");
    }
}

public class methodhiding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();
        
        parent.display(); 
        child.display();  
    }
}

