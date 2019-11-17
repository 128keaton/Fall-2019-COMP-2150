package mem.kbrleson.assignment7.misc;

// The following ListNode class is used for Question1, and 2)
//ListNode is a class for storing a single node of a linked list storing
//integer values.  It has two public data fields for the data and the link to
//the next node in the list and has three constructors:

public class ListNode {
    public int data;
    public ListNode next;

    // post: constructs a node with data 0 and null link
    public ListNode() {
        this(0, null);
    }

    // post: constructs a node with given data and null link
    public ListNode(int data) {
        this(data, null);
    }

    // post: constructs a node with given data and given link
    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}
