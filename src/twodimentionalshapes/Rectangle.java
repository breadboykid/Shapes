package twodimentionalshapes;

public class Rectangle extends Shape implements Actions{

    double length, width;
    public final int SIDES = 4;
    public final int SIDES_REQUIRED = 2;

    public Rectangle(){
        super("Rectangle");
    }

    public double getArea(){
        return (length*width);
    }

    public double getPerimeter(){
        return ((length+width)*2);
    }

    public int getNumberOfSides(){
        return SIDES;
    }

    public int getNumberOfSidesNeeded(){
        return SIDES_REQUIRED;
    }
}
