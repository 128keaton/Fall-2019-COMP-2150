// kbrleson
// Assignment 3 - Question 4
// COMP-2150
// September 30th, 2019

package mem.kbrleson.assignment3;

class A {
    public void ma1() {
        System.out.println(" CA ");
    }
}

class B extends A {
    public void ma1(){
        System.out.println(" B from A ");
    }
    public void mb1(){
        System.out.println(" B or C ");
    }
    public static void mbs(){
        System.out.println(" B only static ");
    }
}

class C extends B {
    public void ma1(){
        System.out.println(" C from B ");
    }

    public void mc1(){
        System.out.println(" C only");
    }

    public static void mbs(){
        System.out.println(" C only static");
    }
}

public class Question4 {
    public static void main(String[] args){
        A a = new A();
        a = new B();
        a = new C();
        B b = new B();
        C c = new C();

        a.ma1();
        c.ma1();
        c.mb1();
        c.mc1();
        B.mbs();
        C.mbs();
        B.mbs();

    }
}
