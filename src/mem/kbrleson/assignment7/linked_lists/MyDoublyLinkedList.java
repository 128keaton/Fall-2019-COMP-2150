package mem.kbrleson.assignment7.linked_lists;
// kbrleson
// November 17th, 2019

public class MyDoublyLinkedList<E> implements IMyDoublyLinkedList<E> {
    private int size;
    private Node<E> head, tail;

    // Constructors

    public MyDoublyLinkedList(E[] objects) {
        for (E object : objects) add(object);
    }

    // Methods

    //*** ADDING ***
    public void add(E e) {
        addLast(e);
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e); // Create a new node
        if (tail == null)                // if empty list
            head = tail = newNode;        // new node is the only node in list
        else {
            head.previous = newNode;
            newNode.next = head;        // link the new node with the head
            head = newNode;            // head points to the new node
        }
        size++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e); // Create a new for element e
        if (tail == null)            // if empty list
            head = tail = newNode;    // new node is the only node in list
        else {
            tail.next = newNode;     // Link the new with the last node
            newNode.previous = tail;
            tail = tail.next;
        }
        size++;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException(); //according to Java doc.
        else if (index == 0) addFirst(e);
        else if (index == size) addLast(e);
        else {
            Node<E> current = getNodeAt(index);
            Node<E> newNode = new Node<>(e, current, current.next);

            current.next.previous = newNode;
            current.next = newNode;
            size++;
        }
    }

    //*** REMOVING ***
    public E removeFirst() {
        if (size == 0)
            return null;
        else {
            Node<E> temp = head;    // element will be returned
            head = head.next;
            head.previous = null;
            size--;
            if (head == null)        // if list becomes empty
                tail = null;
            return temp.element;    // return the removed element
        }
    }

    public E removeLast() {
        if (size == 0)
            return null;
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> temp = tail;

            tail = temp.previous;
            tail.next = null;
            temp.previous = null;
            size--;

            return temp.element;        // return last
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size)
            return null;
        else if (index == 0)
            return removeFirst();
        else if (index == size - 1)
            return removeLast();
        else {
            Node<E> toRemove = getNodeAt(index);
            toRemove.previous.next = toRemove.next;
            toRemove.next.previous = toRemove.previous;
            size--;

            return toRemove.element;
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

    public E get(int index) {
        if (index < 0 || index >= size)
            return null;
        else if (index == 0)
            return getFirst();
        else if (index == size - 1)
            return getLast();
        else {
            return getNodeAt(index).element;
        }
    }

    //*** SETTING ***
    public E set(int index, E e) {
        if (index < 0 || index > size - 1)
            return null;
        Node<E> current = getNodeAt(index);
        E temp = current.element;
        current.element = e;
        return temp;
    }

    //*** TOSTRING ***
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node current = head;
        int lastIndex = size - 1;
        for (int i = 0; i < size; i++) {
            if (current != null) {
                result.append(current.element);
                current = current.next;
                if (i < lastIndex) {
                    result.append(", ");    // Separate two elements with a comma
                }
            }
        }

        result.append("]");    // Insert the closing ] in the string
        return result.toString();
    }

    public String toReversedString() {
        StringBuilder result = new StringBuilder("[");

        Node current = tail;
        int lastIndex = size - 1;
        for (int i = lastIndex; i > -1; i--) {
            if (current != null) {
                result.append(current.element);
                current = current.next;
                if (i > 0) {
                    result.append(", ");    // Separate two elements with a comma
                }
            }
        }
        result.append("]");    // Insert the closing ] in the string

        return result.toString();
    }

    //*** CHECKING ***
    public int size() {
        return size;
    }

    public String listType() {
        return "Refactored";
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

    public int lastIndexOf(E e) {
        int lastIndex = -1;
        Node<E> current = tail;
        for (int i = (size - 1); i > -1; i--) {
            if (current.element.equals(e))
                lastIndex = i;
            current = current.previous;
        }
        return lastIndex;
    }

    //*** HELPER METHODS ***
    private void checkIndex(int idx) {
        if (idx < 0 || idx >= size)
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: "
                    + size);
    }

    private Node<E> getNodeAt(int index) {
        Node<E> nodeAtIndex;
        int i;
        if (index < size / 2) {
            for (i = 0, nodeAtIndex = head; i < index; i++) {
                nodeAtIndex = nodeAtIndex.next;
            }
        } else {
            for (i = size + 1, nodeAtIndex = tail; i > index; i--) {
                nodeAtIndex = nodeAtIndex.previous;
            }
        }

        return nodeAtIndex;
    }

    //*** INNER NODE CLASS ***
    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> previous;

        Node(E e) {
            element = e;
        }

        Node(E e, Node<E> previous, Node<E> next){
            this.previous = previous;
            this.next = next;
            this.element = e;
        }
    }
}