class Student {
    int studentId;
    String studentName;
    String course;
    int age;
    Student() {
        studentId = 101;
        studentName = "Shashank";
        course = "B.Tech CSE AIML";
        age = 20;
    }
    Student(int id, String name, String course, int age) {
        this.studentId = id;
        this.studentName = name;
        this.course = course;
        this.age = age;
    }
    void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Age: " + age);
    }
}
public class Cons{
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Default Constructor:");
        s1.displayDetails();
        Student s2 = new Student(102, "Rahul",
                "B.Tech CSE", 21);
        System.out.println("\nParameterized Constructor:");
        s2.displayDetails();
    }
}
