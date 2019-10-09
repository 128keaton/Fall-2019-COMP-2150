package mem.kbrleson.lecture5;

public class CircleWithException {

    private double radius;
    /**
     * The number of the objects created
     */
    private static int numberOfObjects = 0;

    public CircleWithException() { // default radius = 1.0
        this(1.0);
    }

    public CircleWithException(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * Set a new radius -----> this method might throw exception
     */
    public void setRadius(double newRadius) throws IllegalArgumentException {
        if (newRadius >= 0)
            radius = newRadius;
        else // ***********************  /
            throw new IllegalArgumentException("Radius cannot be negative");
    }

    /**
     * Return numberOfObjects
     */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Return the area of this circle
     */
    public double findArea() {
        return radius * radius * 3.14159;
    }
}
