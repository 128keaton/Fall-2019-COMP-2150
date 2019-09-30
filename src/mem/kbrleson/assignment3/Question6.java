// kbrleson
// Assignment 3 - Question 6
// COMP-2150
// September 30th, 2019

package mem.kbrleson.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

enum ShapeName {
	Circle, Triangle, Square
}

class Shape {
	void draw() {
	    System.out.println("Shape draw()");
    }

    void erase() {
        System.out.println("Shape erase()");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle draw()");
    }

    void erase() {
        System.out.println("Circle erase()");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle draw()");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Square draw()");
    }

    void erase() {
        System.out.println("Square erase()");
    }
}


 class ShapeCreator {
	private static Shape byName(ShapeName shapeName) {
		switch (shapeName) {
            case Circle:
                return new Circle();
            case Square:
                return new Square();
            case Triangle:
                return new Triangle();
        }
        return null;
	}

	private static Shape randomShape() {
        Random rand = new Random();
        List<ShapeName> shapeNameList = Arrays.asList(ShapeName.values());

        ShapeName randomShapeName = shapeNameList.get(rand.nextInt(shapeNameList.size()));
        return byName(randomShapeName);
    }

    static List<Shape> randomList(int maxSize) {
        ArrayList<Shape> shapes = new ArrayList<>();

        for(int iterator = 0; iterator < maxSize; iterator++) {
            shapes.add(ShapeCreator.randomShape());
        }

        return shapes;
    }
}

public class Question6 {
    public static void main(String[] args){
        List<Shape> rs1 = ShapeCreator.randomList(10);
        List<Shape> rs2 = ShapeCreator.randomList(10);

        System.out.println("Test Draw:");
        System.out.println("---------------------");
        testDraw(rs1);

        System.out.println("---------------------");
        System.out.println("Test Erase:");
        System.out.println("---------------------");
        testErase(rs2);
    }

    private static void testDraw(List<Shape> shapes) {
        for(Shape shape : shapes) {
            shape.draw();
        }
    }

    private static void testErase(List<Shape> shapes) {
        for(Shape shape : shapes) {
            shape.erase();
        }
    }
}
