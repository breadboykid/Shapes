package threedimensionalshapes;

public class Cube extends ThreeDimShape{

    protected double length;
    private static final int SIDES = 12;
    private static final int SIDES_REQUIRED = 1;
    private static final int FACES = 6;

    protected Cube() {
        super("Cube", SIDES, SIDES_REQUIRED, FACES);
    }

    protected double getSurfaceArea(){
        return (Math.pow(length, 2)*FACES);
    }

    protected double getVolume(){
        return Math.pow(length, 3);
    }

    protected void setLengths(){
        System.out.println("Please enter length of cube:");
        this.length = scan.nextDouble();
    }
}
