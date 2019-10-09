// a matter of constructor with/without arguments

// uncomment line 21 to see the compiler error 
// uncomment line 9 to 11 to fix the problem.

package mem.kbrleson.lecture3;

class Example3 {
    private int var;

    Example3() {
        System.out.println(" in super () ");
    }

    public Example3(int num) {
        var = num;
    }

    public int getValue() {
        return var;
    }

}

class Example4 extends Example3 { // needs to have a no-arg constructor for parent Example3
    public Example4(String name) {  // need to uncomment Example3() code above..
        System.out.println("in Example4");
    }
}

public class ConstructorNoSuper {
    public static void main(String args[]) {
        Example3 myobj1 = new Example3(3); // compiler error with no super() defined
        // compiler is trying to create an object (myobj1) with a no-arg constructor()
        Example3 myobj = new Example3();

        System.out.println("value of var is: " + myobj.getValue());

    }
}
