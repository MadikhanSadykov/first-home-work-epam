package com.madikhan.shape.twodimensionalshape;

public class Circle extends TwoDimensionalShape {

    private double radius;

    public Circle() {
        this(10.0); // default value
    }

    public Circle(double radius) {
        this(radius, 0, 0);
    }

    public Circle(double radius, int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
