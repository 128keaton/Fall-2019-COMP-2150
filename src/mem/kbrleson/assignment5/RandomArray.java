package mem.kbrleson.assignment5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RandomArray {
    private static final int RAND_INT_ARRAY_SIZE = 50;
    private static final Scanner SCANNER = new Scanner(System.in);

    private static int[] randomArray;

    public static void main(String[] args) {
        randomArray = new Random().ints(RAND_INT_ARRAY_SIZE, 0, 99).toArray();

        System.out.println("list[" + RAND_INT_ARRAY_SIZE + "] of random int generated");

        int[] lines = {0};
        Arrays.stream(randomArray).forEach(r -> {
            if (lines[0] == 5) {
                System.out.println(r);
                lines[0] = 0;
            } else {
                lines[0] = lines[0] + 1;
                System.out.print(r + " ");
            }
        });

        System.out.println();
        System.out.println();
        promptForIndex("Enter an index:");
    }

    private static void promptForIndex(String promptMessage) {
        System.out.print(promptMessage + " ");
        int index = SCANNER.nextInt();

        try {
            System.out.print("The element is " + randomArray[index]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.print("Out of Bound. ");
            promptForIndex("Try again:");
        }
    }
}
