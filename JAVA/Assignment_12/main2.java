class Employee {
    int employeeId;
    String employeeName;
    Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    void calculateSalary() {
        System.out.println("Calculating employee salary...");
    }
}
class FullTimeEmployee extends Employee {
    double monthlySalary;
    FullTimeEmployee(int employeeId, String employeeName, double monthlySalary) {
        super(employeeId, employeeName);
        this.monthlySalary = monthlySalary;
    }
    void calculateSalary() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Monthly Salary: Rs. " + monthlySalary);
    }
}
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double paymentPerHour;
    PartTimeEmployee(int employeeId, String employeeName,
                     int hoursWorked, double paymentPerHour) {
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.paymentPerHour = paymentPerHour;
    }
    void calculateSalary() {
        double salary = hoursWorked * paymentPerHour;
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Payment Per Hour: Rs. " + paymentPerHour);
        System.out.println("Total Salary: Rs. " + salary);
    }
}
public class main2 {
    public static void main(String[] args) {
        Employee e;
        e = new FullTimeEmployee(101, "Rahul", 30000);
        System.out.println("Full-Time Employee Details:");
        e.calculateSalary();
        System.out.println();
        e = new PartTimeEmployee(102, "Aman", 80, 200);
        System.out.println("Part-Time Employee Details:");
        e.calculateSalary();
    }
}
