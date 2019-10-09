

public class TestCircleWithPrivateDataFields {
	/** Main method */
	public static void main(String[] args) {
		// Create a Circle with radius 5.0
		
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
		CircleWithPrivateDataFields myCircle1 = new CircleWithPrivateDataFields(10.0);
		CircleWithPrivateDataFields myCircle3 = new CircleWithPrivateDataFields(15.0);
	
		 //	double y= myCircle.radius; // compiler error unless radius is public in myCircle
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

		// Increase myCircle's radius by 10%
		myCircle.setRadius(myCircle3.getRadius() * 1.1);
		int x = myCircle.getNumberOfObjects();

		System.out.println("The area of the circle of radius " + myCircle3.getRadius() + " is " + myCircle.getArea());

		System.out.println(" number of Object = " + x);
	}
}
