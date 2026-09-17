class Maximum {
    // Maximum between two integers
    int max(int a, int b) {
        return (a > b) ? a : b;
    }
    // Maximum between three integers
    int max(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > c)
            return b;
        else
            return c;
    }
    // Maximum between two decimal numbers
    double max(double a, double b) {
        if (a > b)
            return a;
        else
            return b;
    }
}
public class partB_Q3 {
    public static void main(String[] args) {
        Maximum m = new Maximum();
        System.out.println("Maximum of two integers: " + m.max(10, 20));
        System.out.println("Maximum of three integers: " + m.max(10, 30, 20));
        System.out.println("Maximum of two decimal numbers: " + m.max(10.5, 20.8));
    }
}
