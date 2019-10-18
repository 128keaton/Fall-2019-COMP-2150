package mem.kbrleson.assignment5;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidOperatorException extends Exception {
    InvalidOperatorException(String invalidOperator) {
        super("Error! '" + invalidOperator + "' is not a valid operator. Try again.");
    }
}

public class SimpleMath {
    public static void main(String[] args) {
        System.out.print("Enter a simple mathematical formula: ");
        promptForFormula();
    }

    private static void promptForFormula() {
        double firstNumber, secondNumber;
        String operator;

        Scanner SCANNER = new Scanner(System.in);

        try {
            firstNumber = SCANNER.nextDouble();
            operator = SCANNER.next();
            secondNumber = SCANNER.nextDouble();

            safelyPerformOperation(firstNumber, operator, secondNumber);
        } catch (InputMismatchException ex) {
            System.out.println("Error! Invalid number format. Try again");
            promptForFormula();
        }
    }

    private static void safelyPerformOperation(double firstNumber, String operator, double secondNumber) {
        try {
            System.out.println("Result: " + performOperation(firstNumber, operator, secondNumber));
        } catch (InvalidOperatorException ex) {
            System.out.println(ex.getMessage());
            promptForFormula();
        }
    }

    private static double performOperation(double firstNumber, String operator, double secondNumber) throws InvalidOperatorException {
        switch (operator) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                return firstNumber / secondNumber;
            default:
                throw new InvalidOperatorException(operator);
        }
    }
}
