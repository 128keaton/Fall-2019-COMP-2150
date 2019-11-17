package mem.kbrleson.assignment7;
// kbrleson
// November 17th, 2019

import mem.kbrleson.assignment7.linked_lists.IMyDoublyLinkedList;
import mem.kbrleson.assignment7.linked_lists.MyDoublyLinkedList;
import mem.kbrleson.assignment7.linked_lists.MySlowDoublyLinkedList;

// I created a singular test function to test both DoublyLinkedList classes using an interface
// Pass an object implementing the IMyDoublyLinkedList
public class TestDoublyLinkedLists {

    public static void main(String[] args) {
        double originalTime, refactoredTime;
        String[] array = {"A", "B", "A", "A"};

        MySlowDoublyLinkedList<String> originalDoublyLinkedList = new MySlowDoublyLinkedList<>(array);
        MyDoublyLinkedList<String> refactoredLinkedList = new MyDoublyLinkedList<>(array);

        System.out.println("--[" + originalDoublyLinkedList.listType() + " MyDoublyLinkedList Test Started]--");
        originalTime = runTest(originalDoublyLinkedList);
        System.out.println("--["+ originalDoublyLinkedList.listType() + " MyDoublyLinkedList Test Finished]--");

        System.out.println("\n--[" + refactoredLinkedList.listType() + " MyDoublyLinkedList Test Started]--");
        refactoredTime = runTest(refactoredLinkedList);
        System.out.println("--[" + refactoredLinkedList.listType() + " MyDoublyLinkedList Test Finished]--");

        System.out.println("\n--[Results]--");

        double timeDifference = (originalTime - refactoredTime) / 1000000.0 ;
        if (timeDifference > 0) {
            System.out.println("Testing showed the refactored MyDoubleLinkedList performed better than the original MyDoublyLinkedList by " + timeDifference + " milliseconds");
        } else {
            System.out.println("Testing showed the original MyDoubleLinkedList performed better than the refactored MyDoublyLinkedList by " + Math.abs(timeDifference) + " milliseconds");
        }

    }

    private static double runTest(IMyDoublyLinkedList<String> list) {
        long startTime = System.nanoTime();
        long endTime, duration;

        System.out.printf("%-32s%-10s\n", "Initialized with:", list);

        testAdding(list);
        testGetting(list);
        testSetting(list);
        testRemoving(list);
        testChecking(list);

        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("\n DURATION = " + duration / 1000000.0 + " msecs ");
        System.out.printf("\n%-32s%-10s\n", "ToString: ", list);
        System.out.printf("%-32s%-10s\n", "ToReversedString: ", list.toReversedString());

        //the follow code should throw an exception
        int Xnum = 20;
        System.out.println("\nAdding 'X' at : " + Xnum);
        if (Xnum > list.size()) {
            Xnum = list.size();
        }
        System.out.println("size of list = " + list.size());

        list.add(Xnum, "X");
        System.out.println(list);

        return duration;
    }

    private static void testAdding(IMyDoublyLinkedList<String> list) {
        System.out.printf("\n%-32s%-10s\n", "Adding elements: ", list);
        list.addFirst("*");
        System.out.printf("%-32s%-10s\n", "  - '*' at first", list);
        list.addLast("C");
        System.out.printf("%-32s%-10s\n", "  - 'C' at last", list);
        list.add("D");
        System.out.printf("%-32s%-10s\n", "  - 'D'", list);
        list.add(2, "#");
        System.out.printf("%-32s%-10s\n", "  - '#' @ 2", list);
    }

    private static void testGetting(IMyDoublyLinkedList<String> list) {
        System.out.printf("\n%-32s%-10s\n", "Getting elements: ", list);
        System.out.printf("%-32s%-10s\n", "  - First Element", list.getFirst());
        System.out.printf("%-32s%-10s\n", "  - Last Element", list.getLast());
        System.out.printf("%-32s%-10s\n", "  - Element at 1", list.get(1));
        System.out.printf("%-32s%-10s\n", "  - Element at 20", list.get(20));
    }

    private static void testSetting(IMyDoublyLinkedList<String> list) {
        System.out.printf("\n%-32s%-10s\n", "Setting elements: ", list);
        System.out.printf("%-32s%-10s\n", "  - Element @ 0: '" + list.set(0, "+") + "' -> '+'", list);
        System.out.printf("%-32s%-10s\n", "  - Element @ 2: '" + list.set(2, "-") + "' -> '-'", list);
        System.out.printf("%-32s%-10s\n", "  - Element @ 9: '" + list.set(9, "&") + "' -> '&'", list);
    }

    private static void testRemoving(IMyDoublyLinkedList<String> list) {
        System.out.printf("\n%-32s%-10s\n", "Removing elements: ", list);
        System.out.printf("%-32s%-10s\n", "  - First element '" + list.removeFirst() + "'", list);
        System.out.printf("%-32s%-10s\n", "  - Last element '" + list.removeLast() + "'", list);
        System.out.printf("%-32s%-10s\n", "  - Element @ 1 '" + list.remove(1) + "'", list);
        System.out.printf("%-32s%-10s\n", "  - Element @ 9 '" + list.remove(9) + "'", list);
    }

    private static void testChecking(IMyDoublyLinkedList<String> list) {
        System.out.printf("\n%-32s%-10s\n", "Checking: ", list);
        System.out.printf("%-32s%-10s\n", "  - Contains 'A'? ", list.contains("A"));
        System.out.printf("%-32s%-10s\n", "  - Contains 'Z'? ", list.contains("Z"));
        System.out.printf("%-32s%-10s\n", "  - First occurrence of 'A' @ ", list.indexOf("A"));
        System.out.printf("%-32s%-10s\n", "  - Last occurrence of 'A' @ ", list.lastIndexOf("A"));
        System.out.printf("%-32s%-10s\n", "  - First index of 'Z' @", list.indexOf("Z"));
        System.out.printf("%-32s%-10s\n", "  - Last index of 'Z' @", list.lastIndexOf("Z"));
    }

}
