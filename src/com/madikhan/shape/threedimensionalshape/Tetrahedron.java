package com.madikhan.shape.threedimensionalshape;

public class Tetrahedron extends ThreeDimensionalShape{

    private double side;

    public Tetrahedron() {
        this(10); // default value
    }

    public Tetrahedron( double side ) {
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
