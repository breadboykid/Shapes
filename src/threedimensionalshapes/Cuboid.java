package threedimensionalshapes;

public class Cuboid extends ThreeDimShape{

    protected double length, width, height;
    private static final int SIDES = 12;
    private static final int SIDES_REQUIRED = 3;
    private static final int FACES = 6;

    protected Cuboid() {
        super("Cuboid", SIDES, SIDES_REQUIRED, FACES);
    }

    protected double getSurfaceArea(){
        return (2*((height*width)+(width*length)+(length*height)));
    }

    protected double getVolume(){
        return (length*height*width);
    }

    protected void setLengths(){
        System.out.println("Please enter length of cube:");
        this.length = scan.nextDouble();
        System.out.println("Please enter width of cube:");
        this.width = scan.nextDouble();
        System.out.println("Please enter height of cube:");
        this.height = scan.nextDouble();
    }
}