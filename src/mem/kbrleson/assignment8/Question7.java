package mem.kbrleson.assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Question7 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 99, -4, 6));
        Queue<Integer> queue = new LinkedList<>(integers);

        System.out.println("Original list");
        System.out.println(queue);

        System.out.println("largest = " + getLargest(queue));

        System.out.println("After finding maxi, the list is");
        System.out.println(queue);
    }

    // The original code modifies the queue which is not what we want
    static int getLargestIncorrectly(Queue<Integer> q) {
        int largest = q.remove(); // assume the first one is the largest.
        for(int i=0; i < q.size(); i++) {
            largest = Math.max(largest, q.remove());
        }

        return largest;
    }

    // The CORRECT way to get the largest from a queue without modifying the original queue
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
