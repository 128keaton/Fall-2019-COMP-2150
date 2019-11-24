package mem.kbrleson.assignment8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question5 {
    public static void main(String[] args) {
        Stack<Integer> stackOne = new Stack<>();
        stackOne.push(2);
        stackOne.push(6);
        stackOne.push(1);

        doThis(stackOne);

        Stack<Integer> stackTwo = new Stack<>();
        stackTwo.push(42);
        stackTwo.push(-3);
        stackTwo.push(4);
        stackTwo.push(15);
        stackTwo.push(9);

        doThis(stackTwo);

    }

    public static void doThis(Stack<Integer> x) {
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
