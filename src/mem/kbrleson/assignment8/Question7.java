package mem.kbrleson.assignment8;

import java.util.LinkedList;
import java.util.Queue;

public class Question7 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(99);
        q.add(-4);
        q.add(6);


        System.out.println("Original list");
        System.out.println(q);

        System.out.println("largest = " + getLargest(q));

        System.out.println("After finding maxi, the list is");
        System.out.println(q);
    }

    // The original code modifies the queue which is not what we want
    static int getLargestIncorrectly(Queue<Integer> q) {
        int largest = q.remove(); // assume the first one is the largest.
        for(int i=0; i < q.size(); i++) {
            largest = Math.max(largest, q.remove());
        }

        return largest;
    }

    private static int getLargest(Queue<Integer> queue) {
        // Make a copy of the original queue
        Queue<Integer> q = new LinkedList<>(queue);
        int largest = q.remove();
        q.add(largest);
        for(int i=0; i < q.size(); i++) {
            int current = q.remove();
            largest = Math.max(largest, current);
            q.add(current);
        }

        return largest;
    }
 }
