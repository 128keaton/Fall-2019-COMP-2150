package mem.kbrleson.assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Question9 {
    public static void main(String[] args) {
        ArrayList<String> messagesArray = new ArrayList<>(Arrays.asList("Hello", "Yes", "Good Morning", "Good Evening", "Where is the ATM machine?", "no"));
        Stack<String> messages = new Stack<>();
        messages.addAll(messagesArray);

        System.out.println("Original Stack:");
        System.out.println(messages);

        System.out.println("The longest string is: \"" + getLongestFromStack(messages) + "\"");

        System.out.println("Stack contents after the search:");
        System.out.println(messages);
    }

    // Get the longest string from the stack
    private static String getLongestFromStack(Stack<String> stack) {
        // Make a new stack containing the elements of the old stack
        Stack<String> newStack = new Stack<>();
        newStack.addAll(stack);

        // Assume the largest message is the first string in the stack
        String largestMessage = newStack.pop();
        while (!newStack.isEmpty()) {
            String currentMessage = newStack.pop();
            // Compare the current message with the largest message so far
            if (currentMessage.length() > largestMessage.length()) {
                largestMessage = currentMessage;
            }
        }

        return largestMessage;
    }
}
