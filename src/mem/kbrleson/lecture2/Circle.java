
public class Circle {
	private double radius = 1;

	public double getArea() {
		return radius * radius * Math.PI;
	}
	public void setRadius(double r) {
		this.radius = r;
	}
	public double getRadius() {
		return this.radius;
	}
	public static void main(String[] args) {
		Circle myCircle = new Circle();		
		System.out.println("Area of Radius " + myCircle.radius + " is " + myCircle.getArea());
		myCircle.setRadius(10);

		System.out.println(" Radius is set to 10 ");
		System.out.println("Area of Radius " + myCircle.radius + " is " + myCircle.getArea());
	}
}
