package mem.kbrleson.assignment1;

// kbrleson@memphis.edu
// Sept 8th, 2019

import java.util.Arrays;

@SuppressWarnings("WeakerAccess")
public class Question5 {

    public static void main(String[] args){
        printLine(5, 9);
    }

    public static void printLine(int min, int max) {
        int[] rangeArray = getRangeArray(min, max);

        System.out.println("Given (5 to 9) the program displays: ");

        // Total range
        System.out.println(formatOutput(toStringArray(rangeArray)));

        shiftRangeArray(rangeArray);
    }

    private static int[] getRangeArray(int from, int to) {
        int[] newRangeArray = new int[to - (from - 1)];

        for (int curr = from; curr <= to; curr++) {
            newRangeArray[curr - from] = curr;
        }

        return newRangeArray;
    }

    private static void shiftRangeArray(int[] rangeArray) {
        int[] currentArray = rangeArray;
        for (int currentLoop = 0; currentLoop < (rangeArray.length - 1); currentLoop++) {
            int[] shiftedArray = new int[currentArray.length];

            System.arraycopy(currentArray, 1, shiftedArray, 0, currentArray.length - 1);

            shiftedArray[currentArray.length - 1] = currentArray[0];

            System.out.println(formatOutput(toStringArray(shiftedArray)));

            currentArray = shiftedArray;
        }
    }

    private static String[] toStringArray(int[] integerArray) {
        return Arrays.stream(integerArray).mapToObj(String::valueOf).toArray(String[]::new);
    }

    private static String formatOutput(String[] stringArray) {
        return String.join("", stringArray);
    }
}
