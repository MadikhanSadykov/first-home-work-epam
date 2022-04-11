package com.madikhan.shape.threedimensionalshape;

import com.madikhan.shape.Shape;

public abstract class ThreeDimensionalShape extends Shape {

     private int zCoordinate;


     public ThreeDimensionalShape() {
          super();
          this.zCoordinate = 0;
     }

     public ThreeDimensionalShape(int xCoordinate, int yCoordinate, int zCoordinate) {
          super(xCoordinate, yCoordinate);
          this.zCoordinate = zCoordinate;
     }


     public abstract double getVolume();
     public abstract double getSurfaceArea();


     @Override
     public String toString(){
          return String.format("Surface area: %.2f%nVolume: %.2f%n", getSurfaceArea(), getVolume());
     }

     public int getZCoordinate() {
          return zCoordinate;
     }

     public void setZCoordinate(int zCoordinate) {
          this.zCoordinate = zCoordinate;
     }
}
