package com.madikhan.shape.threedimensionalshape;

public class Tetrahedron extends ThreeDimensionalShape{

    private double side;

    public Tetrahedron() {
        this(0, 0, 0, 10);
        // default value
    }

    public Tetrahedron(double side) {
        this(0, 0, 0, side);
    }

    public Tetrahedron(int xCoordinate, int yCoordinate, int zCoordinate, double side) {
        super(xCoordinate, yCoordinate, zCoordinate);
        this.side = side;
    }



    @Override
    public double getVolume() {
        return side * side * side / (Math.sqrt(2)*6);
    }

    @Override
    public double getSurfaceArea() {
        return side * side * Math.sqrt(3);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
