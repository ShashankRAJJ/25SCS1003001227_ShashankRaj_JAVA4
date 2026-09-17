class Display {
    // Display only name
    void show(String name) {
        System.out.println("Name: " + name);
    }
    // Display name and age
    void show(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    // Display name, age and marks
    void show(String name, int age, double marks) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}
public class partB_Q2 {
    public static void main(String[] args) {
        Display d = new Display();
        d.show("Shashank");
        System.out.println();
        d.show("Shashank", 20);
        System.out.println();
        d.show("Shashank", 20, 85.5);
    }
}
