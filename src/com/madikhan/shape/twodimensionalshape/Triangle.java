package com.madikhan.shape.twodimensionalshape;

public class Triangle extends TwoDimensionalShape{

    double firstSide;
    double secondSide;
    double thirdSide;

    public Triangle() {
        this(10.0, 10.0, 10.0); // default value
    }

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter*(halfPerimeter-firstSide)*(halfPerimeter-secondSide)*(halfPerimeter-thirdSide));
    }

    @Override
    double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }
}
