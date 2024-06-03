package edu.geometry;

public class Rectangle implements Shape {

    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
//        shapes.add(this);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
     public double calculateArea() {
        return length * width;
    }
}
