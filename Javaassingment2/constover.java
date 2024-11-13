class Student {
    String name;
    int age;
    String course;

    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.course = "Unknown";
    }

    public Student(String name) {
        this.name = name;
        this.age = 0;
        this.course = "Unknown";
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = "Unknown";
    }

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class constover{
    public static void main(String[] args) {
        
     Student student1 = new Student();
        Student student2 = new Student("yo");
        Student student3 = new Student("ko", 20);
        Student student4 = new Student("so", 21, "Computer Science");

        student1.display();
        student2.display();
      student3.display();
        student4.display();
    }
}



