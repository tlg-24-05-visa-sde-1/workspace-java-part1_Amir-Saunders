package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;

import java.util.ArrayList;
import java.util.Collection;

public class ShapeClient {

    public static void main(String[] args) {

        Collection<Shape> numberOfShapes = new ArrayList<>();

        Circle circle = new Circle(12.5,"blue",5.0);
        Rectangle rectangle = new Rectangle(12.5,10.5);
        Triangle triangle = new Triangle(10,15.6);

        numberOfShapes.add(circle);
        numberOfShapes.add(rectangle);
        numberOfShapes.add(triangle);
        System.out.println(numberOfShapes.size());




    }

}
