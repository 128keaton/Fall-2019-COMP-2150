package mem.kbrleson.assignment6;


import java.util.Arrays;
import java.util.stream.Collectors;

class Circle implements Comparable<Circle> {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public int compareTo(Circle o) {
        if (this.getRadius() >= o.getRadius()) {
            return 1;
        }

        return 0;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return String.valueOf(this.radius);
    }
}


public class Question6 {
    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];

        for(E element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 6, 7, 9, -2};
        String[] colors = new String[]{"orange", "red", "purple", "green", "blue"};
        Circle[] circles = new Circle[]{new Circle(3.0), new Circle(9.2), new Circle(2.9), new Circle(5.9)};

        System.out.println(Arrays.stream(integers).map(Object::toString).collect(Collectors.joining(" ")));
        System.out.println("Max Integer is " + max(integers));

        System.out.println(String.join(" ", colors));
        System.out.println("Max Color is " + max(colors));

        System.out.println(Arrays.stream(circles).map(Circle::toString).collect(Collectors.joining(" ")));
        System.out.println("Max Circle Radius is " + max(circles));
    }
}
