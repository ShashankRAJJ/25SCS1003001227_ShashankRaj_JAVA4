class Employee {
    int employeeId;
    String name;
    String designation;
    double salary;
    Employee() {
        employeeId = 101;
        name = "Amit";
        designation = "Developer";
        salary = 30000;
    }
    Employee(int id, String name,
             String designation, double salary) {
        this.employeeId = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    Employee(Employee e) {
        this.employeeId = e.employeeId;
        this.name = e.name;
        this.designation = e.designation;
        this.salary = e.salary;
    }
    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
public class Cons2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(102, "Rahul",
                "Manager", 50000);
        Employee e3 = new Employee(e2);
        System.out.println("Default Constructor:");
        e1.displayDetails();
        System.out.println("\nParameterized Constructor:");
        e2.displayDetails();
        System.out.println("\nCopy Constructor:");
        e3.displayDetails();
    }
}
