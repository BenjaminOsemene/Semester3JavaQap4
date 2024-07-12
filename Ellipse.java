//This is a class for Ellipse which is a subclass of Shape with instance variables a and b axis
//public class Ellipse extends Shape {
    //private double a; 
    //private double b; 

//Constructor for Ellipse with parameter name, first and second axis
    //public Ellipse(String name, double axis1, double axis2) {
        //super(name);
        //this.a = Math.max(axis1, axis2);
        //this.b = Math.min(axis1, axis2);
    //}

//This computes and returns the perimeter of the ellipse
    //public double computePerimeter() {
        //return Math.PI * Math.sqrt(2 * (a * a + b * b) - Math.pow(a - b, 2) / 2);
    //}

//This computes and returns the area of the ellipse
    //public double computeArea() {
        //return Math.PI * a * b;
    //}
//}


 
 //Here the Ellipse class extends Shape 
//provides implementation of scale method, compute area and compute perimeter
//Overriding the scale method to adjust dimensions
public class Ellipse extends Shape {
    private double semiMajorAxis;
    private double semiMinorAxis;

//Constructor
    public Ellipse(double semiMajorAxis, double semiMinorAxis) {
        super("Ellipse");
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    //Overriding methods to compute area, perimeter,scale ellipse,and toSpring
    @Override
    public double computeArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    @Override
    public double computePerimeter() {
        double h = Math.pow(semiMajorAxis - semiMinorAxis, 2) / Math.pow(semiMajorAxis + semiMinorAxis, 2);
        return Math.PI * (semiMajorAxis + semiMinorAxis) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
    }

    @Override
    public void scale(double factor) {
        this.semiMajorAxis *= factor;
        this.semiMinorAxis *= factor;
    }

    @Override
    public String toString() {
        return super.toString() + " with semi-major axis " + semiMajorAxis + " and semi-minor axis " + semiMinorAxis;
    }
}



