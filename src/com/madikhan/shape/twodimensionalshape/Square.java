package com.madikhan.shape.twodimensionalshape;

public class Square extends TwoDimensionalShape {

    private double side;

    public Square() {
        this(10); // default value
    }

    public Square( double side ) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
