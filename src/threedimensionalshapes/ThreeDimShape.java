package threedimensionalshapes;

import java.util.Scanner;

public abstract class ThreeDimShape {

    protected static Scanner scan = new Scanner(System.in);
    static ThreeDimShape obj;

    String shapeName;
    protected static int SIDES, SIDES_REQUIRED, FACES;

    ThreeDimShape(String name, int newSide, int newRequiredLengths, int newFace) {
        this.shapeName = name;
        this.SIDES = newSide;
        this.FACES = newFace;
        this.SIDES_REQUIRED = newRequiredLengths;
    }

    public static void play() {
        boolean isNotValidShape = true;

        while (isNotValidShape) {
            System.out.println("Please enter a shape:");

            String shape = scan.nextLine();

            switch (shape.trim().toLowerCase()) {
                case "sphere":
                    obj = new Sphere();
                    isNotValidShape = false;
                    break;
                case "cube":
                    obj = new Cube();
                    isNotValidShape = false;
                    break;
                case "cuboid":
                    obj = new Cuboid();
                    isNotValidShape = false;
                    break;
                default:
                    System.out.println("Invalid Shape");
            }
        }
        obj.setLengths();
        System.out.printf("\nShape Chosen: %s\nSurface Area = %f\nVolume = %f\nShape Sides = %d\nShape Faces = %d"
                , obj.shapeName, obj.getSurfaceArea(), obj.getVolume(), obj.SIDES, obj.FACES);
    }

    abstract protected double getSurfaceArea();

    abstract protected double getVolume();

    abstract protected void setLengths();
}
