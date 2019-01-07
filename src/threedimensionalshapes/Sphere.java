package threedimensionalshapes;

public class Sphere extends ThreeDimShape {

    protected double radius;
    private static final int SIDES = 0;
    private static final int SIDES_REQUIRED = 1;
    private static final int FACES = 0;

    protected Sphere() {
        super("Sphere", SIDES, SIDES_REQUIRED, FACES);
    }

    protected double getSurfaceArea(){
        return (4*Math.PI*Math.pow(radius, 2));
    }

    protected double getVolume(){
        return (4*Math.PI*Math.pow(radius, 3)/3);
    }

    protected void setLengths(){
        System.out.println("Please enter radius of sphere:");
        this.radius = scan.nextDouble();
    }
}
