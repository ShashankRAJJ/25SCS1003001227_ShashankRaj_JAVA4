class Person {
    String name;
    int age;
    String email;
    Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}
class Student extends Person {
    int studentId;
    String course;
    Student(String name, int age, String email,
            int studentId, String course) {
        super(name, age, email);
        this.studentId = studentId;
        this.course = course;
    }
    void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}
public class Inher1 {
    public static void main(String[] args) {
        Student s = new Student(
                "Shashank Raj",
                20,
                "shashank@example.com",
                101,
                "B.Tech CSE AIML"
        );
        System.out.println("Personal Details:");
        s.displayPersonDetails();
        System.out.println("\nAcademic Details:");
        s.displayStudentDetails();
    }
}

