public class AutoboxingDemo {
    public static void main(String[] args) {
        // Primitive values
        int number = 100;
        double decimal = 25.5;
        char letter = 'A';
        boolean status = true;
        // Autoboxing: Primitive to Wrapper objects
        Integer intObj = number;
        Double doubleObj = decimal;
        Character charObj = letter;
        Boolean boolObj = status;
        // Display converted values
        System.out.println("Integer object: " + intObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Boolean object: " + boolObj);
    }
}
