// Q3. Count how many numbers are divisible by 3 between 1 and N

import java.util.Scanner;

public class Q_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }

        System.out.println("Count of numbers divisible by 3: " + count);

        sc.close();
    }
}
