interface StringOperation {
    String operate(String input);
}

public class StringManipulator {
    public static void main(String[] args) {
        // Lambda expressions for string operations
        StringOperation toUpperCase = str -> str.toUpperCase();
        StringOperation toLowerCase = str -> str.toLowerCase();
        StringOperation reverseString = str -> new StringBuilder(str).reverse().toString();

        // Example string
        String inputString = "Hello, Lambda Expressions!";

        // Perform string operations using lambda expressions
        System.out.println("Original String: " + inputString);
        System.out.println("Uppercase: " + performStringOperation(toUpperCase, inputString));
        System.out.println("Lowercase: " + performStringOperation(toLowerCase, inputString));
        System.out.println("Reversed: " + performStringOperation(reverseString, inputString));
    }

    private static String performStringOperation(StringOperation operation, String input) {
        return operation.operate(input);
    }
}
