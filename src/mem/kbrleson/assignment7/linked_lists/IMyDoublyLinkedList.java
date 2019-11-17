package mem.kbrleson.assignment7.linked_lists;
// kbrleson
// November 17th, 2019

// Interface for both DoublyLinkedList classes
// Makes it easy to test both without repeating code :)
public interface IMyDoublyLinkedList<E> {
    boolean contains(E e);
    int indexOf(E e);
    int lastIndexOf(E e);
    int size();
    void addFirst(E e);
    void addLast(E e);
    void add(E e);
    void add(int index, E e);
    void clear();
    E removeFirst();
    E removeLast();
    E remove(int index);
    E getFirst();
    E getLast();
    E get(int index);
    E set(int index, E e);
    String toReversedString();
    boolean remove(E e);
}
