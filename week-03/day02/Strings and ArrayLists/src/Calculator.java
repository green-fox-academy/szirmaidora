import java.util.Scanner;
public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        Scanner operation = new Scanner(System.in);
        String operationstring = operation.nextLine();
        int operation1 = operation.nextInt();
        int operand2 = operation.nextInt();

        System.out.println(calculate(operationstring, operation1, operand2));




    }
    public static Integer calculate(String op, Integer first, Integer second){
        int result = 0;
        if (op.equals("+")){
            result = first + second;
        }
        else if (op.equals("-")) {
            result = first - second;
        }
        else if (op.equals("*")) {
            result = first * second;
        }
        else if (op.equals("/")){
            result = first * second;
        }
        return result;
    }
}
