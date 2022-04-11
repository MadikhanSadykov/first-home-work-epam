package com.madikhan.shape.twodimensionalshape;

import com.madikhan.shape.Shape;

public abstract class TwoDimensionalShape extends Shape {

    public TwoDimensionalShape() {
        this(0, 0);
    }


    public TwoDimensionalShape(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate);
    }

    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString(){
        return String.format("Area: %.2f%nPerimeter: %2f%n", getArea(), getPerimeter());
    }

}
