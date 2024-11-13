class Student {
    String name;
    int age;
    static String schoolName = "ABC High School";

    public Student(String name, int age) {
        this.name = name; 
        this.age = age;
    }

    static void displaySchool() {
        System.out.println("School: " + schoolName);
    }

    void display() {
        System.out.println("Name: " + this.name); 
        System.out.println("Age: " + this.age);
    }
}

public class thisstatic {
    public static void main(String[] args) {
        Student.displaySchool();
        Student student1 = new Student("Alice", 16);
        Student student2 = new Student("Bob", 17);

        student1.display();
        student2.display();
    }
}

