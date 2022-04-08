package com.madikhan.shape;

import com.madikhan.shape.threedimensionalshape.Cube;
import com.madikhan.shape.threedimensionalshape.Tetrahedron;
import com.madikhan.shape.twodimensionalshape.Circle;
import com.madikhan.shape.twodimensionalshape.Square;
import com.madikhan.shape.twodimensionalshape.Triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Shape shape;
        int dimensionNumber;
        int shapeNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the dimension:\n" +
                "1. One dimension;\n" +
                "2. Two dimension;\n" +
                "3. Three dimension.\n" +
                "==================================================");
        dimensionNumber = scanner.nextInt();

        if ( dimensionNumber == 1 ) {
            System.out.println("Ok, there are only one shape in your chosen dimension, it's a dot.");
            shapeNumber = 0;
        } else if ( dimensionNumber == 2 ) {
            System.out.println("Please choose concrete shape:\n" +
                    "1. Circle;\n" +
                    "2. Square;\n" +
                    "3. Triangle.\n" +
                    "==================================================");
            shapeNumber = scanner.nextInt();
        } else if ( dimensionNumber == 3 ) {
            System.out.println("Please choose concrete shape:\n" +
                    "1. Sphere;\n" +
                    "2. Cube;\n" +
                    "3. Tetrahedron.\n" +
                    "==================================================");
            shapeNumber = scanner.nextInt();
        } else {
            System.out.println("There isn't such a dimension!");
            dimensionNumber = shapeNumber = 0;
        }


        int choice = (dimensionNumber * 10) + shapeNumber;


        switch ( choice ) {
            case 11:
                System.out.println("Please enter radius of circle:");
                shape = new Circle(scanner.nextDouble());
                System.out.println(shape.toString());
                break;
            case 12:
                System.out.println("Please enter side of square:");
                shape = new Square(scanner.nextDouble());
                System.out.println(shape.toString());
                break;
            case 13:
                System.out.println("Please enter first side of triangle:");
                double firstSide = scanner.nextDouble();
                System.out.println("Please enter second side of triangle:");
                double secondSide = scanner.nextDouble();
                System.out.println("Please enter third side of triangle:");
                double thirdSide = scanner.nextDouble();
                shape = new Triangle(firstSide, secondSide, thirdSide);
                System.out.println(shape.toString());
                break;
            case 21:
                System.out.println("Please enter radius of sphere:");
                shape = new Square(scanner.nextDouble());
                System.out.println(shape.toString());
                break;
            case 22:
                System.out.println("Please enter side of cube:");
                shape = new Cube(scanner.nextDouble());
                System.out.println(shape.toString());
                break;
            case 23:
                System.out.println("Please enter side of tetrahedron:");
                shape = new Tetrahedron(scanner.nextDouble());
                System.out.println(shape.toString());
                break;
            default:
                System.out.println("There are no such shape=(");
                break;
        }

    }

}
