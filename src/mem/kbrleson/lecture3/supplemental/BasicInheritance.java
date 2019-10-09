package mem.kbrleson.lecture3.supplemental;

class Rect {
    private double length, width;

    public Rect() {
        length = width = 0;
        System.out.println(" Rect() constructor");
    }

    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public String toString() {
        return "Rect, " + length + "x" + width;
    }
}

class Square extends Rect {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public String toString() {
        return "Square, " + super.getLength() + "x" + super.getLength();
    }
}

public class BasicInheritance {
    public static void main(String[] args) {
        Rect rect1 = new Rect(4, 5);
        System.out.println(rect1);
        System.out.println("\tArea: " + rect1.getArea());
        System.out.println("\tPerimeter: " + rect1.getPerimeter());

        Square sq1 = new Square(3);
        System.out.println("\n" + sq1);
        System.out.println("\tArea: " + sq1.getArea());
        System.out.println("\tPerimeter: " + sq1.getPerimeter());

        Rect r = new Rect();
        Rect s = new Square(2);
        System.out.println("\n" + r + ", and " + s);

        r = s;
        System.out.println("\nHere is my rectangle: " + r); // this prints the Square.ToString( );

    }
}
