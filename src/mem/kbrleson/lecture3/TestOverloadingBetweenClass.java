/*
 * This program test the overloading behavior between classes
 */

package mem.kbrleson.lecture3;

public class TestOverloadingBetweenClass {

    public static void main(String[] args) {
        A9 a = new A9();
        B9 b = new B9();
        A9 ab = new B9();

        a.p(10);
        a.p(10.0);
        b.p(5);
        ab.p(10.5);

    }
}

class A9 {
    public void p(double i) {
        System.out.println("in A9 p()");
        System.out.println(i * 2);
    }
}

class B9 extends A9 {

    public void p(int i) {
        System.out.println("in B9 p() i is " + i);
    }

    public void p(double i) {
        System.out.println(" in B9 p(double x) ");
        System.out.println(i * 2);
    }
}

 
