package com.madikhan.shape.threedimensionalshape;

import com.madikhan.shape.Shape;

public abstract class ThreeDimensionalShape extends Shape {

     public abstract double getVolume();
     public abstract double getSurfaceArea();

     @Override
     public String toString(){
          return String.format("Surface area: %.2f%nVolume: %.2f%n", getSurfaceArea(), getVolume());
     }

}
