package twodimentionalshapes;

import java.util.Scanner;

public abstract class Shape{

    Scanner scan = new Scanner(System.in);

    String shapeName;
    public static int SIDES, SIDES_REQUIRED;

    Shape(String name, int newSide, int newRequiredLengths){
        this.shapeName = name;
        this.SIDES = newSide;
        this.SIDES_REQUIRED = newRequiredLengths;
    }

    /*public void getLengths(){
        double[] iter = new double[getNumberOfSidesNeeded()];

        for(int i = 0; i < getNumberOfSides(); i++){
            System.out.println("Enter side" + (i+1) + ":");
            iter[i] = scan.nextDouble();
        }
    }*/

    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public void setLengths();
}
