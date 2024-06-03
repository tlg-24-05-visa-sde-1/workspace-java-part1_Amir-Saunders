package edu.geometry;

public class Circle implements Shape {

    private double radius;
    private String color;
    private double diameter;


    public Circle(double radius, String color, double diameter) {
        this.radius = radius;
        this.color = color;
        this.diameter = diameter;


    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }


    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
