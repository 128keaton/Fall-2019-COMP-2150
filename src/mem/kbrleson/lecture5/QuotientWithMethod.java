package mem.kbrleson.lecture5;

import java.util.Scanner;

// The method terminates the program... that is a NO NO...! Should let the caller terminate the program
public class QuotientWithMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int result = quotient(number1, number2);
        System.out.println(number1 + " / " + number2 + " is " + result);
    }

    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            System.out.println(" you are trying to divide by zero");
            System.out.println("Divisor cannot be zero");
            System.exit(1); // program terminates here...
            // should never let the method (quotient) to terminate the program. The caller
            // should handle this !!
        }
        return number1 / number2;
    }
}
