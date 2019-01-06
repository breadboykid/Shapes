package twodimentionalshapes;

public class Square extends TwoDimShape {

    double length;
    private static final int SIDES = 4;
    private static final int SIDES_REQUIRED = 1;

    public Square() {
        super("Square", SIDES, SIDES_REQUIRED);
    }

    public double getArea() {
        return Math.pow(length, 2);
    }

    public double getPerimeter() {
        return (length * 4);
    }

    public void setLengths() {
        System.out.println("Please enter length of square:");
        this.length = scan.nextDouble();
    }

}

