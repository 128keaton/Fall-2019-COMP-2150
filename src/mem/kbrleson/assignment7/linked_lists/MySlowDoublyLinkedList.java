package mem.kbrleson.assignment7.linked_lists;
// kbrleson
// November 17th, 2019

public class MySlowDoublyLinkedList<E> implements IMyDoublyLinkedList<E> {
    private int size;
    private Node<E> head, tail;

    // Constructors
    public MySlowDoublyLinkedList() {
        head = tail = null;
    }

    public MySlowDoublyLinkedList(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }

    // Methods

    //*** ADDING *** 
    public void add(E e) {
        addLast(e);
    }

    public void addFirst(E e) {        /** add code to set 'previous' */
        Node<E> newNode = new Node<E>(e); // Create a new node
        if (tail == null)                // if empty list
            head = tail = newNode;        // new node is the only node in list
        else {
            newNode.next = head;        // link the new node with the head
            // **** add new codes here to handle the head.previous ****
            head = newNode;            // head points to the new node
        }
        size++;
    }

    public void addLast(E e) {        /** add code to set 'previous' */
        Node<E> newNode = new Node<E>(e); // Create a new for element e
        if (tail == null)            // if empty list
            head = tail = newNode;    // new node is the only node in list
        else {
            tail.next = newNode;    // Link the new with the last node
            tail = tail.next;        // tail now points to the last node
            // you will replace the above line of code with the new.previous
            // and update the tail to newNode....!!
        }
        size++;
    }

    public void add(int index, E e) {/** add code to set 'previous' & to improve performance */
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException(); //according to Java doc.
        else if (index == 0) addFirst(e);
        else if (index == size) addLast(e);
        else {
            Node<E> newNode = new Node<E>(e);
            // you will need to replace the following block of codes with current.previous
            // you will write a getNodeAt(index) for the current Node

            Node<E> current = head;        // ] //
            for (int i = 1; i < index; i++) // ]- get a reference to index-1
                current = current.next;    // ]
            newNode.next = current.next;    // Link the new node to element @ index
            current.next = newNode;        // Link element @ index-1 to newNode
            size++;
        }
    }

    //*** REMOVING *** 
    public E removeFirst() {        /** add code to set 'previous' */
        if (size == 0)    // need to add code to set "previous"
            return null;
        else {
            Node<E> temp = head;    // element will be returned
            head = head.next;
            // need to set head.previous = null here **** //
            size--;
            if (head == null)        // if list becomes empty
                tail = null;
            return temp.element;    // return the removed element
        }
    }

    public E removeLast() {            /** improve performance using 'previous' */
        if (size == 0)            // need to add code to set "previous"
            return null;
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> temp = tail;        // to return it
            // need to update the tail with previous and don't need to current
            Node<E> current = head;    // get ref. to second to last
            for (int i = 0; i < size - 2; i++)
                current = current.next;
            tail = current;
            tail.next = null;            // remove last
            size--;
            return temp.element;        // return last
        }
    }

    public E remove(int index) {    /** add code to set 'previous' */
        if (index < 0 || index >= size)
            return null;
        else if (index == 0)
            return removeFirst();
        else if (index == size - 1)
            return removeLast();
        else {  // needs new codes to set current with getNodeAt(index) and update previous
            Node<E> previous = head;
            for (int i = 1; i < index; i++)
                previous = previous.next;
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }

    public boolean remove(E e) {
        if (indexOf(e) >= 0) {    //if the element exists
            remove(indexOf(e));    //call the other remove method
            return true;
        } else
            return false;
    }

    public void clear() {
        size = 0;
        head = tail = null;
    }

    //*** GETTING ***
    public E getFirst() {
        if (size == 0)
            return null;
        else
            return head.element;
    }

    public E getLast() {
        if (size == 0)
            return null;
        else
            return tail.element;
    }

    public E get(int index) {        /** improve performance using 'previous' */
        if (index < 0 || index >= size)
            return null;
        else if (index == 0)
            return getFirst();
        else if (index == size - 1)
            return getLast();
        else {   // needs new code here... getNodeAt(index).element;....to replace the following
            Node<E> current = head;        // ]
            for (int i = 0; i < index; i++)    // ]- get a reference to node @ index
                current = current.next;    // ]
            return current.element;
        }
    }

    //*** SETTING *** 
    public E set(int index, E e) {    /** improve performance using 'previous' */
        if (index < 0 || index > size - 1)
            return null;
        Node<E> current = head;   // ** need to replace this with getNodeAt(index) and the following for loop
        for (int i = 0; i < index; i++)
            current = current.next;
        E temp = current.element;
        current.element = e;
        return temp;
    }

    //*** TOSTRING *** 
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null)
                result.append(", ");    // Separate two elements with a comma
            else
                result.append("]");    // Insert the closing ] in the string
        }
        return result.toString();
    }

    public String toReversedString() {/** write code to return a string representing the list from right to left */
        return null;
    }

    //*** CHECKING *** 
    public int size() {
        return size;
    }

    public String listType() {
        return "Original";
    }

    public boolean contains(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e))
                return true;
            current = current.next;
        }
        return false;
    }

    public int indexOf(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e))
                return i;
            current = current.next;
        }
        return -1;
    }

    public int lastIndexOf(E e) {    /** improve performance using 'previous' */
        // this whole method needs to be replaced
        // set your current Node to tail to start
        int lastIndex = -1;
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e))
                lastIndex = i;
            current = current.next;
        }
        return lastIndex;
    }

    //*** HELPER METHODS ***
    private void checkIndex(int idx) {
        if (idx < 0 || idx >= size)
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: "
                    + size);
    }

    private Node<E> getNodeAt(int index) { /** write code for this method to return a reference to a node at a given index */
        // a big chunk of codes are here
        return null;
    }

    //*** INNER NODE CLASS *** 
    private static class Node<E> {
        /**
         * add code to consider 'previous'
         */
        E element;
        Node<E> next;   // you need to add previous here

        public Node(E e) {
            element = e;
        }
    }
}