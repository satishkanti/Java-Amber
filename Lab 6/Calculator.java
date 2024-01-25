interface ArithmeticOperation {
    double operate(double a, double b);
}

public class Calculator {
    public static void main(String[] args) {
        // Lambda expressions for arithmetic operations
        ArithmeticOperation addition = (a, b) -> a + b;
        ArithmeticOperation subtraction = (a, b) -> a - b;
        ArithmeticOperation multiplication = (a, b) -> a * b;
        ArithmeticOperation division = (a, b) -> a / b;

        // Numbers to perform operations on
        double num1 = 10.0;
        double num2 = 5.0;

        // Perform arithmetic operations using lambda expressions
        System.out.println("Addition: " + performOperation(addition, num1, num2));
        System.out.println("Subtraction: " + performOperation(subtraction, num1, num2));
        System.out.println("Multiplication: " + performOperation(multiplication, num1, num2));
        System.out.println("Division: " + performOperation(division, num1, num2));
    }

    private static double performOperation(ArithmeticOperation operation, double a, double b) {
        return operation.operate(a, b);
    }
}
