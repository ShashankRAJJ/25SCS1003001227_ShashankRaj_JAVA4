class Calculator {
    // Add two integers
    int add(int a, int b) {
        return a + b;
    }
    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
    // Add two decimal numbers
    double add(double a, double b) {
        return a + b;
    }
}
public class partB_Q1 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum of two integers: " + c.add(10, 20));
        System.out.println("Sum of three integers: " + c.add(10, 20, 30));
        System.out.println("Sum of two decimal numbers: " + c.add(10.5, 20.5));
    }
}