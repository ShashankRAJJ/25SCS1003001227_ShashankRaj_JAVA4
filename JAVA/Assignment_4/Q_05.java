// Q.5 Password length checker

import java.util.Scanner;

public class Q_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int length = password.length();

        if (length < 8) {
            System.out.println("Password is too short");
        } 
        else if (length >= 8 && length < 12) {
            System.out.println("Password is Acceptable");
        }
        else {
            System.out.println("Password is Strong");
        }

        sc.close();
    }
}

