package mem.kbrleson.assignment4;

abstract class Nogo1 {
    Nogo1() { System.out.println("Nogo1()"); }
}

abstract class Nogo2 {
    // Define an abstract method 'abstractMethod()'
    abstract void abstractMethod();
}

// Class that extends Nogo1
class Go1 extends Nogo1 {
    // Constructor for Go1 which will print 'Go1()' when instantiated
    Go1() {
        System.out.println("Go1()");
    }
}

// Class that extends Nogo2
class Go9 extends Nogo2 {
    // Constructor for Go9 which will print 'Go9()' when instantiated
    Go9() {
        System.out.println("Go9()");
    }

    // Overridden abstract method of Nogo2, defined by Go9
    @Override
    void abstractMethod() {
        System.out.println("Get 'abstractMethod()' out of abstraction");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Nogo1 nogo1; // = new Nogo1(); -- You cannot instantiate an abstract class.
        Nogo2 nogo2; // = new Nogo2(); -- To use the methods defined, you must define a class that implements the abstract class

        Go1 go1 = new Go1(); // This will display 'Nogo1()' and 'Go1()' in the console since the parent constructor is called from the sub-class (polymorphism)

        Go9 go9 = new Go9(); // This will display 'Go9()' in the console since 'Nogo2' does not provide an explicit constructor like Nogo1
        go9.abstractMethod(); // Run the Go9 class's overridden method of the 'abstractMethod()' defined in 'Nogo2'
    }
}
