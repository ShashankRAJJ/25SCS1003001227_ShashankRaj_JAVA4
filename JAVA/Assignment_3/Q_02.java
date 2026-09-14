
import java.util.Scanner;

// Q2. Email Address Input

public class Q_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
