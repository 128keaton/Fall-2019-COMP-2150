// to test the CircleWithStaticMembers class 

public class TestCircleWithStaticMembers {
 
  public static void main(String[] args) {
    System.out.println("Before creating objects");
    System.out.println("The number of Circle objects is " +
      CircleWithStaticMembers.numberOfObjects);

    // Create c1 (notice the constructor with no-argument)
    CircleWithStaticMembers c1 = new CircleWithStaticMembers();

    // Display c1 BEFORE c2 is created
    System.out.println("\nAfter creating c1");
    System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects created = " +
      c1.numberOfObjects);

    // Create c2 (notice the constructor with one argument)
    CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);

    // Modify c1
    c1.radius = 9;

    // Display c1 and c2 AFTER c2 was created
    System.out.println("\nAfter creating c2 and modifying c1");
    System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects created = " +
    	      c1.numberOfObjects);
    System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects created = " +
    	      c2.numberOfObjects);
  }
}
