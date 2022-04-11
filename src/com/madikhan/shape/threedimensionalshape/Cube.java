package com.madikhan.shape.threedimensionalshape;

public class Cube extends ThreeDimensionalShape{

    private double side;

    public Cube() {
        this(10); // default value
    }

    public Cube( double side ) {
        this(0, 0, 0, side);
    }

    public Cube(int xCoordinate, int yCoordinate, int zCoordinate, double side) {
        super(xCoordinate, yCoordinate, zCoordinate);
        this.side = side;
    }



    @Override
    public double getVolume() {
        return side * side * side;
    }

    @Override
    public double getSurfaceArea() {
        return 6 * side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
