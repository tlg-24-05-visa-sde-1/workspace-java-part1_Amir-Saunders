package edu.geometry;

import java.awt.*;

public class Triangle implements Shapes {

    private double base;
    private double height;


    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
//        shapes.add(this);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double calculateArea() {
        return 0.5 * base * height;
    }




}
