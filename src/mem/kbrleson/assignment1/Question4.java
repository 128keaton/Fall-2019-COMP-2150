package mem.kbrleson.assignment1;

// kbrleson@memphis.edu
// Sept 8th, 2019

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input six non-negative digits: ");
        reverseAndPrint(scanner.nextInt());


        System.out.println("\nExample from assignment: ");
        reverseAndPrint(987654);
    }

    // Breaks and integer down into the individual digits
    private static void reverseAndPrint(int a){
        // Gets the amount of digits by converting the int a to a string, then getting the length of the string (cheating?)
        int length = String.valueOf(a).length();
        int count = 0;

        // New, empty array to contain the digits
        int[] digits = new int[length];

        // While integer a is greater than zero, we loop and modify a by taking modulo 10 of the number to get the next number, then we divide by 10 and repeat.
        while (a > 0){
            digits[count] = a % 10;
            count++;
            a /= 10;
        }

        // Loop through the digits and print in the correct order
        for(int i : digits){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
