// Q3. Number divisibility check

import java.util.Scanner;

public class Q_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5");

            if (num % 10 == 0) {
                System.out.println(num + " is also divisible by 10");
            } else {
                System.out.println(num + " is not divisible by 10");
            }

        } else {
            System.out.println(num + " is not divisible by 5");
        }

        sc.close();
    }
}
