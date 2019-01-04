package twodimentionalshapes;

import java.util.Scanner;

public class Square extends Shape implements Actions {

    double length;
    public static final int SIDES = 4;
    public static final int SIDES_REQUIRED = 1;

    public Square() {
        super("Square");
    }

    public double getArea() {
        return Math.pow(length, 2);
    }

    public double getPerimeter() {
        return (length * 4);
    }

    public int getNumberOfSides(){
        return SIDES;
    }

    public int getNumberOfSidesNeeded(){
        return SIDES_REQUIRED;
    }


}

