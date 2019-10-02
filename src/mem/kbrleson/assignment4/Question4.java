// kbrleson
// October 2nd, 2019

package mem.kbrleson.assignment4;

// Import interfaces from the 'interfacesQ4' package
import mem.kbrleson.assignment4.interfacesQ4.InterfaceOne;
import mem.kbrleson.assignment4.interfacesQ4.InterfaceTwo;

// Define class that implements both 'InterfaceOne' and 'InterfaceTwo'
class ImplementedInterfaces implements InterfaceOne, InterfaceTwo {
    @Override
    public void countOne() {
        System.out.println("ONE");
    }

    @Override
    public void countTwo() {
        System.out.println("TWO");
    }

    @Override
    public void countThree() {
        System.out.println("THREE");
    }
}

public class Question4 {
    public static void main(String[] args) {
        // Create instance of class 'ImplementedInterfaces'
        ImplementedInterfaces implementedInterfaces = new ImplementedInterfaces();

        // Call implemented methods
        implementedInterfaces.countOne();
        implementedInterfaces.countTwo();
        implementedInterfaces.countThree();
    }
}
