package mem.kbrleson.assignment8;

import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        // Setup both Queues with integers
        ArrayList<Integer> integersOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Queue<Integer> queueOne = new LinkedList<>(integersOne);

        doThis(queueOne);

        ArrayList<Integer> integersTwo = new ArrayList<>(Arrays.asList(42, -3, 4, 15, 9, 71));
        Queue<Integer> queueTwo = new LinkedList<>(integersTwo);

        doThis(queueTwo);
    }

    private static void doThis(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        for (int i = 0; i < size; i++) {
            int n = q.remove();
            if (n % 2 == 0) {
                s.add(n);
            } else {
                q.add(n);
            }
        }
        System.out.println(q + " " + s);
    }
}
