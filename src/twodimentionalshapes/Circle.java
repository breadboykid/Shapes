package twodimentionalshapes;

public class Circle extends TwoDimShape {

    double radius;
    private static final int SIDES = 1;
    private static final int SIDES_REQUIRED = 1;

    public Circle() {
        super("Circle", SIDES, SIDES_REQUIRED);
    }

    public double getArea() {
        return Math.pow(radius, 2) * (Math.PI);
    }

    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }

    public void setLengths() {
        System.out.println("Please enter Circle radius:");
        this.radius = scan.nextDouble();
    }
}