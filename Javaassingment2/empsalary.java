import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
    double basic_salary;
    double gross_salary;

  public Employee(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
        calculateGrossSalary();
    }

    void calculateGrossSalary() {
        double hra = 0.10 * basic_salary; 
        double da = 0.15 * basic_salary; 
        gross_salary = basic_salary + hra + da; }

    void display() {
        System.out.println("Employee ID" + emp_id);
        System.out.println("Employee Name" + emp_name);
        System.out.println("Basic Salary" + basic_salary);
        System.out.println("Gross Salary" + gross_salary);
    }
}

public class empsalary  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID");
        int emp_id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter Employee Name ");
        String emp_name = scanner.nextLine();

        System.out.println("Enter Basic Salary");
        double basic_salary = scanner.nextDouble();

        Employee emp = new Employee(emp_id, emp_name, basic_salary);
        emp.display();
    }
}