package twodimentionalshapes;

import java.util.Scanner;

public abstract class TwoDimShape {

    public static Scanner scan = new Scanner(System.in);
    static TwoDimShape obj;

    String shapeName;
    public static int SIDES, SIDES_REQUIRED;

    TwoDimShape(String name, int newSide, int newRequiredLengths) {
        this.shapeName = name;
        this.SIDES = newSide;
        this.SIDES_REQUIRED = newRequiredLengths;
    }

    public static void play() {
        boolean isNotValidShape = true;

        while (isNotValidShape) {
            System.out.println("Please enter a shape:");

            String shape = scan.nextLine();
            System.out.println(shape);

            switch (shape.trim().toLowerCase()) {
                case "circle":
                    obj = new Circle();
                    isNotValidShape = false;
                    break;
                case "square":
                    obj = new Square();
                    isNotValidShape = false;
                    break;
                case "rectangle":
                    obj = new Rectangle();
                    isNotValidShape = false;
                    break;
                default:
                    System.out.println("Invalid Shape");
            }
        }
        obj.setLengths();
        System.out.println("Perimeter = " + obj.getPerimeter() + "\nArea = " + obj.getArea());
        System.out.println("Shape sides = " + obj.SIDES);
    }

    abstract public double getArea();

    abstract public double getPerimeter();

    abstract public void setLengths();
}
