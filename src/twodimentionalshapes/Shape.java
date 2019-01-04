package twodimentionalshapes;

import java.util.Scanner;

public abstract class Shape{

    Scanner scan = new Scanner(System.in);

    String shapeName;

    Shape(String name){
        this.shapeName = name;
    }

    public void getLengths(){
        double[] iter = new double[getNumberOfSidesNeeded()];

        for(int i = 0; i < getNumberOfSides(); i++){
            System.out.println("Enter side" + (i+1) + ":");
            iter[i] = scan.nextDouble();
        }
    }



    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public int getNumberOfSides();
    abstract public int getNumberOfSidesNeeded();
}
