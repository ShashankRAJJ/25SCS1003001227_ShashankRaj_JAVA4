// Q1. Sum of two numbers
import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int firstNum = sc.nextInt();
        System.out.print("Enter Second Number:");
        int secondNum = sc.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum: " + sum);
    }    
}
