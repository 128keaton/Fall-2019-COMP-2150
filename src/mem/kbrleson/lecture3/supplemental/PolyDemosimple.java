package mem.kbrleson.lecture3.supplemental;

class Shape {
    Shape() {
        System.out.println(" from Base Shape");
    }

    void draw() { // default implementation of draw method
        System.out.println("Base (Shape) Drawing a shape");
    }

    void disp(int x) {
        System.out.println(" x is " + x);
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Rectangle Draw() - extended from Shape");
    } // Rectangle is-a Shape

    void disp(String x) {
        System.out.println(" x is" + x);
    }
}

class Circle extends Shape { // Circle is-a Shape
    @Override
        /*
         * Override the draw method Implementation for drawing a circle
         */
    void draw() {
        System.out.println("Cirle draw : extended from Shape");
    }
}

public class PolyDemosimple {
    public static void main(String args[]) {
        Shape s = new Rectangle(); /* (print "from Base Shape"
         * 's' is a reference variable of Shape
         * class which refers to Rectangle object
         */
        Shape sp = new Shape(); // print "from Base Shape"
        sp.draw(); // Shape class (base) to draw it.
        s.draw(); // calls draw() method of Rectangle class
        s = new Circle(); // 's' now refers to a circle object now
        s.draw(); // calls draw() method of Circle class
        Rectangle r = new Rectangle();
        r.disp(5);
        r.disp("writing in Rec");


    }
}
