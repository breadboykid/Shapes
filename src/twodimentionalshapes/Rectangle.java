package twodimentionalshapes;

public class Rectangle extends TwoDimShape {

    double length, width;
    private static final int SIDES = 4;
    private static final int SIDES_REQUIRED = 2;

    public Rectangle() {
        super("Rectangle", SIDES, SIDES_REQUIRED);
    }

    public double getArea() {
        return (length * width);
    }

    public double getPerimeter() {
        return ((length + width) * 2);
    }

    public void setLengths() {
        System.out.println("Please enter Rectangle length:");
        this.length = scan.nextDouble();
        System.out.println("Please enter Rectangle width:");
        this.width = scan.nextDouble();
    }
}
