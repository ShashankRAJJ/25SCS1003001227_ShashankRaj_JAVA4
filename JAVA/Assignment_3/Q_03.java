// Q3. Simple Interest Calculator

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        int P = sc.nextInt();

        System.out.print("Enter Rate of Interest: ");
        int R = sc.nextInt();

        System.out.print("Enter Time(in years): ");
        int T = sc.nextInt();
        
        int SI = (P * R * T) / 100;
        System.out.println("Simple Interst: " + SI);
    }    
}
