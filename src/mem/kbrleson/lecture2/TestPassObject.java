// This program passes the object CircleWithPrivateDataFields thru the printAreas method to 
// print a series of circle areas of difference radius

// the printArea() is a static method 

public class TestPassObject {
  /** Main method */
  public static void main(String[] args) {
    // Create a Circle object with radius 1
    CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);

    // Print areas for radius 1, 2, 3, 4, and 5.
    int n = 5;
    printAreas(myCircle, n);

    // See myCircle.radius and times
    System.out.println("\n" + "Radius is " + myCircle.getRadius());
    System.out.println("n is " + n);
  }
   public static void printAreas(CircleWithPrivateDataFields c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
          System.out.println(c.getRadius() + "\t\t" + c.getArea());
          c.setRadius(c.getRadius() + 1);
          times--;
        }
      }
    
    
  }

