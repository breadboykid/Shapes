package twodimentionalshapes;

public class Circle extends TwoDimShape {

    protected double radius;
    private static final int SIDES = 1;
    private static final int SIDES_REQUIRED = 0;

    public Circle() {
        super("Circle", SIDES, SIDES_REQUIRED);
    }

    protected double getArea() {
        return Math.pow(radius, 2) * (Math.PI);
    }

    protected double getPerimeter() {
        return (2 * Math.PI * radius);
    }

    protected void setLengths() {
        System.out.println("Please enter Circle radius:");
        this.radius = scan.nextDouble();
    }
}