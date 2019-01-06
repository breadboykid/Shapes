package twodimentionalshapes;

public class Rectangle extends TwoDimShape {

    double length, width;
    private static final int SIDES = 4;
    private static final int SIDES_REQUIRED = 2;

    protected Rectangle() {
        super("Rectangle", SIDES, SIDES_REQUIRED);
    }

    protected double getArea() {
        return (length * width);
    }

    protected double getPerimeter() {
        return ((length + width) * 2);
    }

    protected void setLengths() {
        System.out.println("Please enter Rectangle length:");
        this.length = scan.nextDouble();
        System.out.println("Please enter Rectangle width:");
        this.width = scan.nextDouble();
    }
}
