// kbrleson
// October 2nd, 2019

package mem.kbrleson.assignment4;


// Abstract class 'A' defines an abstract method 'call()' and a method 'callA()'
abstract class A {
    abstract void call();
    void callA() {
     System.out.println("concrete method callA() in A");
    }
}

// Class 'B' extends 'A' and defines the method 'call()' per the extension
class B extends A {
    @Override
    void call() {
        System.out.println("B’s implementation of A's call()");
    }
}

public class Question1 {
    public static void main(String[] args) {
        // Create a new 'B' class and call the two methods
        B B1 = new B();
        B1.call();
        B1.callA();
    }
}
