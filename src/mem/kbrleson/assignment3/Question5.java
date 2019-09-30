// kbrleson
// Assignment 3 - Question 5
// COMP-2150
// September 30th, 2019

package mem.kbrleson.assignment3;

class Base {
    public void m1() {
        System.out.println("From Parent Class");
    }
}

class Derive extends Base {
    public void m1() {
        System.out.println("From Derive:Parent Class");
    }
}

class D1 extends Derive {
    public void m1() {
        System.out.println("From D1:Derive Class");
    }
}

public class Question5 {
    public static void main(String[] args) {
        Base base = new Base();
        Derive derive = new Derive();
        D1 d1 = new D1();

        Base[] objs = new Base[3];
        objs[0] = base;
        objs[1] = derive;
        objs[2] = d1;

        for(Base obj : objs) {
            obj.m1();
        }
    }
}
