
// use the testCircleWithStaticMembers.java file to test run this 
// this program has a static variable numberOfObjects and a static method getNumberOfObjects( )
// change the numberOfObjects to not static and observe...
// change the getNumberOfObjects ( ) to not static and see...

public class CircleWithStaticMembers {
 
  public double radius;

  static int numberOfObjects = 0;

  CircleWithStaticMembers() {
    radius = 1.0;
    numberOfObjects++;
  }
// update number of circle objects created.
  CircleWithStaticMembers(double newRadius) {
    radius = newRadius;
    numberOfObjects++;
  }

  static int getNumberOfObjects() {
    return numberOfObjects;
  }

  double getArea() {
    return radius * radius * Math.PI;
  }
}

