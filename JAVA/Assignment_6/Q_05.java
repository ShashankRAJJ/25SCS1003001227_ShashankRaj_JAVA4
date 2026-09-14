// Q5. Count Occurrence of an Element in an Array

import java.util.Scanner;

public class Q_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to count: ");
        int search = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                count++;
            }
        }

        System.out.println(search + " occurs " + count + " time(s)");

        sc.close();
    }
}
