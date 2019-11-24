package mem.kbrleson.assignment8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question6 {
    public static void main(String[] args) {
        Queue<Integer> queueOne = new LinkedList<>();
        queueOne.add(1);
        queueOne.add(2);
        queueOne.add(3);
        queueOne.add(4);
        queueOne.add(5);
        queueOne.add(6);

        doThis(queueOne);

        Queue<Integer> queueTwo = new LinkedList<>();;
        queueTwo.add(42);
        queueTwo.add(-3);
        queueTwo.add(4);
        queueTwo.add(15);
        queueTwo.add(9);
        queueTwo.add(71);

        doThis(queueTwo);

    }
    
    public static void doThis(Queue<Integer> q) {
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
