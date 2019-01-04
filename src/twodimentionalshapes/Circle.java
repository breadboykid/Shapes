package twodimentionalshapes;

public class Circle extends Shape implements Actions{

    double radius;
    public final int SIDES = 1;
    public final int SIDES_REQUIRED = 1;

    public Circle(){
        super("Circle");
    }

    public double getArea(){
        return Math.pow(radius, 2)*(Math.PI);
    }

    public double getPerimeter(){
        return (2*Math.PI*radius);
    }

    public int getNumberOfSides(){
        return SIDES;
    }

    public int getNumberOfSidesNeeded(){
        return SIDES_REQUIRED;
    }
}