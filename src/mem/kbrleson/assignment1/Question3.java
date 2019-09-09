package mem.kbrleson.assignment1;

// kbrleson@memphis.edu
// Sept 8th, 2019

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 1st integer: ");
        int x = scanner.nextInt();

        System.out.print("Input 2nd integer: ");
        int y = scanner.nextInt();

        printSum(x, y);
        printDifference(x, y);
        printProduct(x, y);
        printAverage(x, y);
        printDistance(x, y);
        printMaxMin(x, y);
    }

    // Outputs the sum of a and b
    private static void printSum(int a, int b){
        System.out.println("Sum of two integers: " + (a + b));
    }

    // Outputs the difference of a and b
    private static void printDifference(int a, int b){
        System.out.println("Difference of two integers:  " + (a - b));
    }

    // Outputs the product of a and b
    private static void printProduct(int a, int b){
        System.out.println("Product of two integers:  " + (a * b));
    }

    // Outputs the average of a and b
    private static void printAverage(int a, int b){
        System.out.println("Average of two integers:  " + ((a + b) / 2.0));
    }

    // Outputs the distance from 0,0 to a,b and the distance between a and b
    private static void printDistance(int a, int b){
        System.out.println("distance = " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        System.out.println("Distance of two integers: " + Math.abs((a - b)));
    }

    // Outputs the smaller and larger number, a or b
    private static void printMaxMin(int a, int b){
        int maxInteger = (a > b) ? a : b;
        int minInteger = (a < b) ? a : b;

        System.out.println("Max integer: " + + maxInteger);
        System.out.println("Min integer: " + + minInteger);
    }
}
