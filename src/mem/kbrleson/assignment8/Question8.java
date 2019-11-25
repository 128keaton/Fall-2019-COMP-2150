package mem.kbrleson.assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Question8 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        Stack<Integer> stack = new Stack<>();
        stack.addAll(integers);

        System.out.println("Original stack");
        System.out.println(stack);

        removeEvenIntegers(stack);

        System.out.println("Stack after removing even integers");
        System.out.println(stack);
    }

    // The original code makes an infinite loop
    private static void removeEvenIntegersIncorrectly(Stack<Integer> s1) {
        while (!s1.isEmpty()) {
            int n = s1.pop();
            if (n % 2 != 0) {
                s1.push(n); // if odd put it back.
            }
        }
    }

    // Makes a copy of the stack and removes any even elements from the original stack
    private static void removeEvenIntegers(Stack<Integer> origStack) {
        Stack<Integer> s1 = new Stack<>();
        s1.addAll(origStack);

        while (!s1.isEmpty()) {
            int n = s1.pop();
            if (n % 2 == 0) {
                origStack.removeElement(n);
            }
        }
    }
}
