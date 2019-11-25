package mem.kbrleson.assignment8;

import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        ArrayList<Integer> integersOne = new ArrayList<>(Arrays.asList(2, 6, 1));
        Stack<Integer> stackOne = new Stack<>();
        stackOne.addAll(integersOne);

        doThis(stackOne);

        ArrayList<Integer> integersTwo = new ArrayList<>(Arrays.asList(42, -3, 4, 15, 9));
        Stack<Integer> stackTwo = new Stack<>();
        stackTwo.addAll(integersTwo);

        doThis(stackTwo);
    }

    private static void doThis(Stack<Integer> x) {
        Queue<Integer> q = new LinkedList<>();
        while (!x.isEmpty()) {
            int n = x.pop();
            q.add(n);
            q.add(n);
        }
        while (!q.isEmpty()) {
            x.push(q.remove());
        }
        System.out.println(x);
    }
}
