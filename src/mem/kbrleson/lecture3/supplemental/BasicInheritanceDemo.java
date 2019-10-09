/*

A is the base class and B is the derived class inherited from A. 
Thus, the display( ) method of A is a part of B and 
can be accessed using an object of class B.

*/

package mem.kbrleson.lecture3.supplemental;

class A2 {
    public A2() {
        System.out.println(" A2 constructor");
    }

    //	public A2(String s) {
//		System.out.println(s);
//	}
    public void display() {
        System.out.println("A2.display");
    }
}

/*
 * class B inherites or derives from class A So, display() is a part of class B
 * also.
 */
class B2 extends A2 {
    public B2() {
        System.out.println("B2 Constructor");
    }

    public void print() {
        System.out.println("In class B2");
    }

    public void diplay() {
        System.out.println("B2.diplay()");
    }
}

class C1 extends B2 {
    @Override
    public void diplay() {
        System.out.println("C1.diplay()");
    }

    public void displayC1() {
        System.out.println("c1 only display");
    }
}

public class BasicInheritanceDemo {
    public static void main(String args[]) {
        A2 obj_a = new A2();
        B2 obj_b = new B2();  // B2 has no explicit (user provided) constructor
        C1 obj_c = new C1();  // C1 has no explicit (user provided) constructor
        A2 aRef = new C1(); // upcasting C to A1
        System.out.println(" display aRef.display ");
        aRef.display(); // call display from A2-- C1 does not have display();
        obj_c.diplay(); // you cannot tell which display (C1 or A2)
        obj_c.display();

        System.out.println("-----------------------------");
        obj_a.display();
        obj_c.diplay();
        obj_b.diplay();
        obj_a = obj_b;
        System.out.println(" obj_a = obj_b; ");
        obj_a.display();
        obj_b.diplay();

        if (obj_b instanceof A2) {
            System.out.println(" Obj_b instance of A2");
            obj_a = (A2) obj_b;
        }
        obj_a.display();
        obj_b.print();
        obj_b.display(); // display() from A1 belongs to B also
    }
}
