package com.madikhan.shape.threedimensionalshape;

public class Sphere extends ThreeDimensionalShape{

    private double radius;

    public Sphere() {
        this(0, 0, 0, 10.0); // default value;
    }

    public Sphere(double radius) {
        this(0, 0, 0, radius);
    }

    public Sphere(int xCoordinate, int yCoordinate, int zCoordinate, double radius ) {
        super(xCoordinate, yCoordinate, zCoordinate);
        this.radius = radius;
    }



    @Override
    public double getVolume() {
        return (getSurfaceArea() * radius) / 3.0;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
