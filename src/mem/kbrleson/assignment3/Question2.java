// kbrleson
// Assignment 3 - Question 2
// COMP-2150
// September 30th, 2019

package mem.kbrleson.assignment3;

class Incrementable {
    private int i;

    Incrementable(int i) {
        this.i = i;
    }

    Incrementable increment() {
        this.i++;
        return this;
    }

    @Override
    public String toString() {
        return "i is " + this.i;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Incrementable obj = new Incrementable(0);
        obj.increment().increment().increment().increment();
        System.out.println(obj);
    }
}
