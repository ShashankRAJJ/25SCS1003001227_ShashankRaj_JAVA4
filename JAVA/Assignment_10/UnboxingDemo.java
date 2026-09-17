public class UnboxingDemo {
    public static void main(String[] args) {
        // Wrapper class objects
        Integer intObj = 100;
        Double doubleObj = 25.5;
        Character charObj = 'A';
        Boolean boolObj = true;
        // Unboxing: Wrapper objects to primitive values
        int number = intObj;
        double decimal = doubleObj;
        char letter = charObj;
        boolean status = boolObj;
        // Display converted values
        System.out.println("int value: " + number);
        System.out.println("double value: " + decimal);
        System.out.println("char value: " + letter);
        System.out.println("boolean value: " + status);
    }
}
