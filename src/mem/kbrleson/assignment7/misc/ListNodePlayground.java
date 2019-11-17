package mem.kbrleson.assignment7.misc;
// kbrleson
// November 17th, 2019

// Playground to build answers to Assignment 7
public class ListNodePlayground {
    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        System.out.println("list1");
        iterateListData(list);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        System.out.println("list2");
        iterateListData(list2);

        // Question 2, letter 'e'
        int temp1 = list.data; // Create a temporary var to store ‘1’
        int temp2 = list2.next.data; // Create a temporary var to store ‘3’

        list = list2.next.next; // (1) -> (4)
        list.next = new ListNode(temp1); // (4) -> (4 -> 1)
        list.next.next = new ListNode(list2.data); // (4 -> 1) -> (4 -> 1 -> 2)
        list2 = new ListNode(temp2); // (2 -> 3 -> 4) -> (3)


        System.out.println("list");
        iterateListData(list);

        System.out.println("list2");
        iterateListData(list2);
    }

    // Iterate through list nodes
    private static void iterateListData(ListNode listNode) {
        ListNode currentList = listNode;
        int nestLevel = 0;
        while (currentList != null ){
            StringBuilder nestIndicator = new StringBuilder("→");
            for (int i = 0; i < nestLevel; i++) {
                nestIndicator.append("→");
            }

            System.out.println(nestIndicator  + " data =  " + currentList.data);
            currentList = currentList.next;
            nestLevel++;
        }

        System.out.println("\n");
    }
}
