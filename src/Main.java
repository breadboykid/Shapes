import twodimentionalshapes.*;
import java.util.Scanner;

public class Main{

    private static Scanner scan = new Scanner(System.in);
    static Shape obj;

    public static void main(String[] args){
        System.out.println("Welcome to my program");

        boolean isNotValidShape = true;

        while(isNotValidShape){
            System.out.println("Please enter a shape:");

            String shape = scan.nextLine();
            System.out.println(shape);

            switch(shape.trim().toLowerCase()) {
                case "circle":
                    obj = new Circle();
                    isNotValidShape = false;
                    break;
                case "square":
                    obj = new Square();
                    isNotValidShape = false;
                    break;
                case "rectangle":
                    obj = new Rectangle();
                    isNotValidShape = false;
                    break;
                default:
                    System.out.println("Invalid Shape");
            }
        }

        System.out.println("Perimeter = " + obj.getPerimeter() + "\nArea = " + obj.getArea());
        obj.getLengths();
    }
}
