package twodimentionalshapes;

public class Square extends TwoDimShape {

    double length;
    private static final int SIDES = 4;
    private static final int SIDES_REQUIRED = 1;

    protected Square() {
        super("Square", SIDES, SIDES_REQUIRED);
    }

    protected double getArea() {
        return Math.pow(length, 2);
    }

    protected double getPerimeter() {
        return (length * 4);
    }

    protected void setLengths() {
        System.out.println("Please enter length of square:");
        this.length = scan.nextDouble();
    }

}

