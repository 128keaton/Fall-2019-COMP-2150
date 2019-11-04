package mem.kbrleson.assignment6;

import java.util.ArrayList;
import java.util.Iterator;

public class Question2 {
    public static void main(String[] args) {
        /* After building your GenericStack from the ArrayList, add codes here to build the two Stacks
         *  (String and Integer) here
         */

		GenericStack<String> strings = new GenericStack<>();
		strings.add("Sam");
		strings.add("Emma");
		strings.add("Chris");
		strings.add("McKenzie");
		strings.add("Jonathan");
		strings.add("Taraq");
		strings.add("who are you?");

		System.out.println("start String Stack");
		System.out.println(strings);
		System.out.println("Number of Strings = " + strings.getSize());
		System.out.println("peek the stack = " + strings.peek());
		System.out.println("pop the stack = " + strings.pop());
		System.out.println("Using the enhanced for:");

		for (String string : strings) {
			System.out.print(string + " ");
		}

		System.out.println("\n");

        GenericStack<Integer> integers = new GenericStack<>();
        integers.add(11);
        integers.add(22);
        integers.add(33);
        integers.add(44);
        integers.add(55);
        integers.add(9999);

        System.out.println("start Integer Stack");
        System.out.println(integers);
        System.out.println("Number of Integers = " + integers.getSize());
        System.out.println("peek the stack = " + integers.peek());
        System.out.println("pop the stack = " + integers.pop());
        System.out.println("Using the enhanced for:");

        for (Integer integer : integers) {
        	System.out.print(integer + " ");
		}

    }

    //  Build a static class GenericStack<E> extends ArrayList

    static class GenericStack<E> extends ArrayList<E> {
        public int getSize() {
            return this.size();
        }

        public E peek() {
            return this.get(this.getSize() - 1);
        }

        public void push(E o) {
            this.add(o);
        }

        public E pop() {
            E o = this.peek();
            this.remove(o);
            return o;
        }

        public String toString() {
            return "stack: " + super.toString();
        }
    }
}
