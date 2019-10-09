package mem.kbrleson.lecture3;

public class PolymorphismDemo {
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Display circle and rectangle properties
        // notice the arguments are different for circle and Rect.. but they are
        // subclasses of simpleGeometricObject...

      //  displayObject(new CircleFromSimpleGeometricObject(1, "red", false));

        // displayObject(new RectangleFromSimpleGeometricObject(1, 1, "black", true));
    }

    /**
     * Display geometric object properties
     */
    // Notice the argument is the parent of the Circle... and Rectangule...Classes)
   /* public static void displayObject(SimpleGeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                ". Color is " + object.getColor());
    }*/
}
