public class PrimitiveWrapperDemo {
    public static void main(String[] args) {
        // Primitive data type variables
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40000L;
        float f = 5.5f;
        double d = 10.25;
        char c = 'A';
        boolean bool = true;
        // Wrapper class variables (Autoboxing)
        Byte wb = b;
        Short ws = s;
        Integer wi = i;
        Long wl = l;
        Float wf = f;
        Double wd = d;
        Character wc = c;
        Boolean wbool = bool;
        // Display primitive values
        System.out.println("Primitive Data Type Values:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        // Display wrapper class values
        System.out.println("\nWrapper Class Values:");
        System.out.println("Byte: " + wb);
        System.out.println("Short: " + ws);
        System.out.println("Integer: " + wi);
        System.out.println("Long: " + wl);
        System.out.println("Float: " + wf);
        System.out.println("Double: " + wd);
        System.out.println("Character: " + wc);
        System.out.println("Boolean: " + wbool);
    }
}